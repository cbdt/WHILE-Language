import * as React from 'react';
import * as ReactDOM from 'react-dom';
import {Controlled as CodeMirror, IInstance} from 'react-codemirror2'
import './index.css';
import 'codemirror/lib/codemirror.css'
import 'codemirror/mode/javascript/javascript'
import { Editor, EditorChange } from 'codemirror';

interface ITextEditorProps {
    text: string,
    handleChange?: (value: string) => void,
    isWhile: boolean,
}

interface ITextEditorState {
    value : string
}

class TextEditor extends React.Component<ITextEditorProps, ITextEditorState> {

    public constructor(props : ITextEditorProps) {
        super(props);
        
        this.handleChange = this.handleChange.bind(this);
    }

    public handleChange(editor: IInstance, data: EditorChange, value: string): void {
        if(this.props.handleChange) {
            this.props.handleChange(value);
        }
    }

    public render() {
		var options = {
            //readOnly: this.props.isWhile ? false : true,
            lineNumbers: true,
            mode: "text/typescript",
            lineWrapping: true,
		};
        return (
            <div className={this.props.isWhile ? "whileEditor" : "TSEditor"}>
                <CodeMirror 
                value={this.props.text} 
                onBeforeChange={this.handleChange} 
                options={options}
                />
            </div>
        )
    }

}

export default TextEditor;