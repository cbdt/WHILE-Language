import * as React from 'react';
import logo from './logo.png'
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
            <img src="https://media.giphy.com/media/tXL4FHPSnVJ0A/giphy.gif" width="600px" alt="" className="santa"/>
        )
        return (
            <div className="loader">
            <div className="lds-ellipsis"><div></div><div></div><div></div><div></div></div>
            </div>
        )    
    }
}