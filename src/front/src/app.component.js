import React, { Component } from "react";
import s from "./app.component.css";

import {BrowserRouter, Link} from "react-router-dom";
import Switch from "react-router-dom/es/Router";
import Route from "react-router-dom/es/Route";
// import {Route} from "react-router-dom";

import {Exit} from './modules/exit'

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

                    <Switch>
                        <Route exact path="/">
                            <Exit />
                        </Route>
                        <Route path="/about">
                            About
                        </Route>
                        <Route path="/dashboard">
                            Dashboard
                        </Route>
                    </Switch>

            </div>
        </BrowserRouter>
);
}

/*
class MyComponent extends Component {
    render() {
        return <div className={s.intro}>Hello Victor. You are Greate.</div>;
    }
}

export default MyComponent;
*/


