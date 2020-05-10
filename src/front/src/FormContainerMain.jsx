import 'bootstrap/dist/css/bootstrap.css';
import React, {Component} from 'react';
import s from "./app.component.css";


class FormContainer extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            counter: 0,
            data: 'Initial data...'
        }

        this.updateState = this.updateState.bind(this);
        this.handleClick = this.handleClick.bind(this)

    };

    updateState(event) {
        //debugger;
        console.log("The world is mine")
        this.setState({data: event.target.value})
        console.log(event.target.value)
    }

    handleClick () {
        //debugger;
        console.log("Hello All")
        this.setState({counter: ++this.state.counter})
    }

    render() {
        return (
            <div>
                <div className="container">

                    <div className="row justify-content-end">
                        <div className="col-4">
                            <button type="button" className="btn btn-primary">Primary</button>
                        </div>
                    </div>

                    <div className="row justify-content-end">
                         <div className="col-12 offset-8">
                            <button type="button" className="btn btn-secondary">Block level button</button>
                        </div>
                    </div>

                    <div className="row">
                        <div className="col-4">
                            <button type="button" className="btn btn-success">Block level button
                            </button>
                        </div>
                    </div>

                    <div className="row">
                        <div className="col-12">
                            <button type="button" className="btn btn-dange">Block level button
                            </button>
                        </div>
                    </div>

                </div>

                <input type = "text" value = {this.state.data}
                       onChange = {this.updateState} />

                <h4>{this.state.data}</h4>

                <button className={s.intro}>You are Greate.</button>

                <button className={s.but}>Hello Victor. You are Greate.</button>

                <textarea className={s.text}
                          placeholder={"Enter your name"}/>

                <select  className={s.select}></select>

                <button onClick = {this.handleClick}>
                    Click me!(Already Clicked {this.state.counter} times!)
                </button>

                <h4>{this.state.counter}</h4>

                <input type = "text" value = {this.state.data}
                       onChange = {this.handleClick} />

            </div>
        );
    }
}
export default FormContainer;
