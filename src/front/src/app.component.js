import 'bootstrap/dist/css/bootstrap.css';
import React, { Component } from "react";
//import s from "./app.component.css";

//import FormContainer from './FormContainer.jsx';
import FormContainer from './FormContainerMain.jsx';
//import FormContainer from './containers/FormContainer.jsx';
//import './App.css';




//import {BrowserRouter, Link} from "react-router-dom";
//import Switch from "react-router-dom/es/Switch";
//import Route from "react-router-dom/es/Route";

/*
import {Exit1} from './modules/exit'

export default function BasicExample() {
    return (
        <BrowserRouter basename='/'>
            <div>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/about">About</Link>
                    </li>
                    <li>
                        <Link to="/dashboard">Dashboard</Link>
                    </li>
                    </ul>

                    <hr />

               <button
                   title={"Submit"}
                >

                <input/>
                <textarea/>
                <button />



                <Switch>
                        <Route exact path="/">
                            <Exit1 />
                        </Route>
                        <Route path="/about">
                            534
                        </Route>
                        <Route path="/dashboard">
                            678
                        </Route>
                    </Switch>

            </div>
        </BrowserRouter>
);
}
*/


/*
class MyComponent extends Component {
    render() {
        return  <div>
        <button className={s.intro}>You are Greate.</button>;
        <button className={s.but}>Hello Victor. You are Greate.</button>;
    </div>
    }
}


export default MyComponent;

/*
class App extends Component {
    render() {
        return (
            <div className="container">
                <h3>React Form</h3>
                <FormContainer />
            </div>
        );
    }
}

export default App;

*/

class App extends Component {
    render() {
        return (
            <div className="col-md-6">
                <h3> Sample Form Container </h3>
                <FormContainer />
            </div>
        );
    }
}

export default App;
