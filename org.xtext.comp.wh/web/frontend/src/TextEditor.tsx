import * as React from 'react';
import * as ReactDOM from 'react-dom';
import {Controlled as CodeMirror, IInstance} from 'react-codemirror2'
import './index.css';
import 'codemirror/lib/codemirror.css'
import 'codemirror/mode/javascript/javascript'
import { Editor, EditorChange } from 'codemirror';

interface ITextEditorProps {
    text1: string,
    text2?: string,
    handleChange?: (value: string) => void,
    isWhile: boolean,
}

interface ITextEditorState {
    isTS: boolean,
}

class TextEditor extends React.Component<ITextEditorProps, ITextEditorState> {

    public constructor(props : ITextEditorProps) {
        super(props);

        this.state = {
            isTS: true,
        }

        this.handleChange = this.handleChange.bind(this);
        this.switchCode = this.switchCode.bind(this);
    }

    public handleChange(editor: IInstance, data: EditorChange, value: string): void {
        if(this.props.handleChange) {
            this.props.handleChange(value);
        }
    }

    public switchCode() {
        if(!this.props.text2) return;
        this.setState({
            isTS: !this.state.isTS,
        })
    }

    public render() {
		var options = {
            //readOnly: this.props.isWhile ? false : true,
            lineNumbers: true,
            mode: "text/typescript",
            lineWrapping: true,
        };
        let text : string;
        if(!this.props.text2) {
            text  = this.props.text1;
        } else {
            text = this.state.isTS ? this.props.text1 : this.props.text2;
        }
        return (
            <div className={this.props.isWhile ? "whileEditor" : "TSEditor"}>
                <CodeMirror
                value={text} 
                onBeforeChange={this.handleChange} 
                options={options}
                />
                { this.props.text2 &&
                    <button className="switchCode" onClick={this.switchCode}>
                        { this.state.isTS ? "Code 3A" : "Code TS" }
                    </button>
                }
            </div>
        )
    }

}

export default TextEditor;