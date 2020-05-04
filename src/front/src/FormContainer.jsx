import React, {Component} from 'react';
import s from "./app.component.css";

class FormContainer extends React.Component {

    constructor(props) {
        super(props);

        this.state = {data: 'Initial data...'}
        this.state = {counter: 0}
       
        this.updateState = this.updateState.bind(this);
        this.handleClick = this.handleClick.bind(this)

    };
    updateState(e) {
        //debugger;
        console.log("The world is mine")
        this.setState({data: e.target.value});
    }
    handleClick () {
        //debugger;
        console.log("Hello All")
        this.setState({counter: ++this.state.counter})
    }

    render() {
        return (
            <div>

                <input type = "text" value = {this.state.data}
                       onChange = {this.updateState} />

                <h4>{this.state.data}</h4>

                <button className={s.intro}>You are Greate.</button>

                <button className={s.but}>Hello Victor. You are Greate.</button>

                <textarea className={s.text}
                       placeholder={"Enter your name"}/>

                       <select  className={s.select}></select>

                <h2>{this.state.data}</h2>

                <button onClick = {this.handleClick}>
                    Click me!(Already Clicked {this.state.counter} times!)
                    debugger;
                </button>

                <h4>{this.state.counter}</h4>

                <input type = "text" value = {this.state.data}
                       onChange = {this.handleClick} />

            </div>
        );
    }
}
export default FormContainer;
