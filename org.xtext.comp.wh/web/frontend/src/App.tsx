import * as React from 'react';
import './App.css';
import TextEditor from './TextEditor'
import Button from './Button'
import Loader from './Loader'
import Console from './Console'
import ModalArguments from './ModalArguments'
import axios, { AxiosResponse } from 'axios'

interface IAppProps {

}

interface IAppState {
  whileText : string,
  TSText: string,
  isCompiling: boolean,
  error: boolean,
  filename: string,
  canExecute: boolean,
  consoleText: string,
  modalArguments: boolean,
  arguments: string[],
}

interface CompileResponse {
  value: string,
  error: boolean,
  filename: string,
}

interface ExecuteResponse {
  value: string
}

class App extends React.PureComponent<IAppProps, IAppState>{
  public constructor(props: IAppProps) {
    super(props);
    this.state = {
      whileText: `function main:
read A, B
%
    A := B
%
write A, B`,
      TSText: "",
      isCompiling: false,
      error: false,
      filename: "",
      canExecute: false,
      consoleText: "",
      modalArguments: true,
      arguments: [],
    }

    this.handleChangeWhileEditor = this.handleChangeWhileEditor.bind(this);
    this.handleClickCompile = this.handleClickCompile.bind(this);
    this.handleClickExecute = this.handleClickExecute.bind(this);
    this.handleArgument = this.handleArgument.bind(this);
    this.handleExecute = this.handleExecute.bind(this);
    this.handleRemoveArg = this.handleRemoveArg.bind(this)
  }

  public handleChangeWhileEditor(value: string) {
    this.setState({
      whileText: value,
    })
  }

  public handleArgument(argument: string) {
    this.setState({
      arguments: [...this.state.arguments, argument],
    })
  }

  public handleExecute() {
    this.execute();
    this.setState({
      modalArguments: false,
    })
  }
  
  public handleClickCompile() {
    this.setState({
      isCompiling: true,
    })
    this.compile();
  }

  public handleClickExecute() {
    this.setState({
      modalArguments: true,
    })
  }

  public handleRemoveArg(index: number) {
    this.setState({
      arguments: this.state.arguments.filter((value, i) => {
        return i !== index;
      })
    })
  }

  execute() {
    axios.post("http://localhost:8000/execute", {filename: this.state.filename, args: this.state.arguments})
    .then((response: AxiosResponse<ExecuteResponse>) => {
      this.setState({
        consoleText: response.data.value,
      })
    }).catch((e: any) => {
      alert("Erreur lors l'accès au serveur 😢 : " + e)
    })
  }

  compile() {
    axios.post("http://localhost:8000/compile", {"value": this.state.whileText})
      .then((response: AxiosResponse<CompileResponse>) => {
        console.log(response.data)
        if(response.data.error) {
          this.setState({
            error: true,
            consoleText: response.data.value,
            isCompiling: false,
          })
          return;
        }
        this.setState({
          TSText: response.data.value,
          isCompiling: false,
          filename: response.data.filename,
          canExecute: true,
        });
      }).catch((e: any) => {
        this.setState({
          isCompiling: false,
        });
        alert("Erreur lors l'accès au serveur 😢 : " + e)
      })
  }

  public render() {
      return (
        <div className="container">
          { this.state.modalArguments && 
            <ModalArguments removeArg={this.handleRemoveArg} handleExecute={this.handleExecute} args={this.state.arguments} addArg={this.handleArgument}/>
          }
          <div className="mainText">
            <span>While</span>
            <span>Typescript</span>
          </div>
          <div className="editors">
            <div className="left-col">
              <TextEditor 
              isWhile={true}
              text={this.state.whileText}
              handleChange={this.handleChangeWhileEditor}
              />
            </div>
            <div className="right-col">
              <TextEditor 
              isWhile={false}
              text={this.state.TSText}
              />
              <Loader active={this.state.isCompiling}/>
              <Console arguments={this.state.arguments} text={this.state.consoleText}/>
            </div>
          </div>
          <Button disabled={this.state.isCompiling} className="compileButton" handleClick={this.handleClickCompile}>
            {this.state.isCompiling ? "En cours..." : "Compiler"} 
          </Button>
          {this.state.canExecute &&
            <Button disabled={!this.state.canExecute} className="executeButton" handleClick={this.handleClickExecute}>
              Executer
            </Button>
          }
        </div>
      );
  }
}

export default App;
