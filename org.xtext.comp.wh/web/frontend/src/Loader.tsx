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
            <img src="https://media.giphy.com/media/2tNwHov82yCF1uE8Au/giphy.gif" width="300px" alt="" className="santa"/>
        )
        return (
            <div className="loader">
            <div className="lds-ellipsis"><div></div><div></div><div></div><div></div></div>
            </div>
        )    
    }
}