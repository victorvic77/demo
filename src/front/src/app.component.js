import React, { Component } from "react";
import s from "./app.component.css";

import {BrowserRouter, Link} from "react-router-dom";
import Switch from "react-router-dom/es/Switch";
import Route from "react-router-dom/es/Route";



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

                <button /> { /*Submit */ }
                <input/> {/* Clear the form */}
                <textarea/> {/* Clear the form */}
                <button /> { /*Submit */ }



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



/*
class MyComponent extends Component {
    render() {
        return <div className={s.intro}>Hello Victor. You are Greate.</div>;
    }
}

export default MyComponent;
*/


