import * as React from 'react';
import './App.css';
import TextEditor from './TextEditor'
import Button from './Button'
import Loader from './Loader'
import axios, { AxiosResponse } from 'axios'

interface IAppProps {

}

interface IAppState {
  whileText : string,
  TSText: string,
  isCompiling: boolean,
}

interface JSONResponse {
  value: string,
  error: boolean,
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
    }

    this.handleChangeWhileEditor = this.handleChangeWhileEditor.bind(this);
    this.handleClickCompile = this.handleClickCompile.bind(this);
  }

  public handleChangeWhileEditor(value: string) {
    this.setState({
      whileText: value,
    })
  }

  public handleClickCompile() {
    this.setState({
      isCompiling: true,
    })
    this.postData();
  }

  postData() {
    axios.post("http://localhost:8000/compile", {"value": this.state.whileText})
      .then((response: AxiosResponse<JSONResponse>) => {
        this.setState({
          TSText: response.data.value,
          isCompiling: false,
        });
      }).catch((e: any) => {
        this.setState({
          isCompiling: false,
        });
        alert("Erreur lors l'accès au serveur")
      })
  }

  public render() {
      return (
        <div className="container">
          <div className="mainText">
            <span>While</span>
            <span>Typescript</span>
          </div>
          <div className="editors">
            <TextEditor 
            isWhile={true}
            value={this.state.whileText}
            handleChange={this.handleChangeWhileEditor}
            />
            <TextEditor 
            isWhile={false}
            value={this.state.TSText}
            />
            <Loader active={this.state.isCompiling}/>
          </div>
          <Button disabled={this.state.isCompiling} className="compileButton" handleClick={this.handleClickCompile}>
            {this.state.isCompiling ? "En cours..." : "Compiler"} 
          </Button>
        </div>
      );
  }
}

export default App;
