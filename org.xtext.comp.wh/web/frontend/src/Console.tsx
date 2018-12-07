import * as React from 'react'

interface IConsoleProps {
    text: string,
    arguments: number[],
}

export default function Console(props : IConsoleProps) {
    return (
        <div className="console">
            { props.text && 
                <div style={{padding: 10}}>
                    <div style={{display: "inline"}}>
                    <span>Execution du programme avec les arguments : </span>
                    {props.arguments.map(val => (
                        <span>{val} </span>
                    ))}
                    </div>
                    <p>Output : {props.text}</p>
                </div>
            }
        </div>
    )
} 