import * as React from 'react';
import { string } from 'prop-types';

interface IModalArgumentsProps {
    args: number[],
    addArg: (value: number) => void,
    removeArg: (index: number)  => void,
    handleExecute: () => void,
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
            value: e.currentTarget.value.trim(),
        })
    }

    addArgument() {
        if(Number(this.state.value)) {
            this.props.addArg(Number(this.state.value));
            this.setState({value: ""})
        }
    }

    removeArg(index:number) {
        this.props.removeArg(index);
    }

    render() {
        return (
            <div className="overlay">
                <div className="modal">
                    <div className="arguments">
                        <span>Arguments : </span>
                        {this.props.args.map((value, index) => (
                            <div className="arg">
                            <span>{value}</span>
                            <button onClick={() => this.removeArg(index)} className="removeArg">
                                x
                            </button>
                            </div>
                        ))}
                    </div>
                    <div className="adding">
                        <input className="argInput"type="text" value={this.state.value} onChange={this.handleInput}/>
                        <button className="addArg" onClick={this.addArgument}>+</button>
                    </div>
                    <button className="executeModal" onClick={this.props.handleExecute}>Executer</button>
                </div>
            </div>
        )
    }
}