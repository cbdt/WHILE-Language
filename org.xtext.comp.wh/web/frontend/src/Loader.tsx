import * as React from 'react';

interface ILoaderProps {
    active: boolean,
}

export default class Loader extends React.Component<ILoaderProps> {
    constructor(props: ILoaderProps) {
        super(props);
    }

    render() {
        if(!this.props.active) {
            return null;
        }
        return (
            <div className="loader">
            <div className="lds-ellipsis"><div></div><div></div><div></div><div></div></div>
            </div>
        )    
    }
}