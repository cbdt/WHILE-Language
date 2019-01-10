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
            <img src="http://idata.over-blog.com/4/19/11/95/26/00-gifs-scintillants-animes-divers--4-.gif" width="600px" alt="" className="santa"/>
        )
        return (
            <div className="loader">
            <div className="lds-ellipsis"><div></div><div></div><div></div><div></div></div>
            </div>
        )    
    }
}