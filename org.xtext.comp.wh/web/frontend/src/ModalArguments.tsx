import * as React from 'react';
import { string } from 'prop-types';

interface IModalArgumentsProps {
    args: string[],
    addArg: (value: string) => void,
    removeArg: (index: number)  => void,
    handleExecute: () => void,
    handleClose: () => void,
}

interface IModalArgumentsState {
    value: string;
}

export default class ModalArguments extends React.Component<IModalArgumentsProps, IModalArgumentsState> {
    constructor(props: IModalArgumentsProps) {
        super(props);

        this.state = {
            value: "",
        }
        this.handleInput = this.handleInput.bind(this);
        this.addArgument = this.addArgument.bind(this);
        this.removeArg = this.removeArg.bind(this);
    }

    handleInput(e: React.FormEvent<HTMLInputElement>) {
        this.setState({
            value: e.currentTarget.value
        })
    }

    handleKeyPress = (event: React.KeyboardEvent<HTMLInputElement>) => {
        if(event.key == 'Enter') {
            this.addArgument()
        }
    }

    addArgument() {
        this.props.addArg(this.state.value);
        this.setState({value: ""})
    }

    removeArg(index:number) {
        this.props.removeArg(index);
    }

    render() {
        return (
            <div className="overlay">
                <a className="closeModal" onClick={() => this.props.handleClose()}>
                    X
                </a>
                <div className="modal">
                    <div className="textArg">{this.props.args.length} arguments : </div>
                    <div className="arguments">
                        {this.props.args.map((value, index) => (
                            <a onClick={() => this.removeArg(index)} key={index}>
                            <div className="arg">
                                <span className="numero">{index+1}</span>
                                <span className="text">{value}</span>
                            </div>
                            </a>
                        ))}
                    </div>
                    <div className="adding">
                        <input className="argInput"type="text" value={this.state.value} onChange={this.handleInput} onKeyPress={this.handleKeyPress}/>
                        <button className="addArg" onClick={this.addArgument}>+</button>
                    </div>
                    <button className="executeModal" onClick={this.props.handleExecute}>Executer</button>
                </div>
            </div>
        )
    }
}