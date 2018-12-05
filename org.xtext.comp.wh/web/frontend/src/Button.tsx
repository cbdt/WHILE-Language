import * as React from 'react';

interface IButtonProps {
    handleClick: () => void,
    className: string,
    disabled: boolean,
}

export default class Button extends React.Component<IButtonProps> {
    constructor(props : IButtonProps) {
        super(props);
    }

    public render() {
        return (
            <button disabled={this.props.disabled} className={this.props.className} onClick={this.props.handleClick}>{this.props.children} 
            </button>
        )
    }
}