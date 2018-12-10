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
            <img src="http://annacatharina.a.n.pic.centerblog.net/d122fdfb.gif" width="300px" alt="" className="santa"/>
        )
        return (
            <div className="loader">
            <div className="lds-ellipsis"><div></div><div></div><div></div><div></div></div>
            </div>
        )    
    }
}