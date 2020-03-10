import React, { Component } from "react";
import s from "./app.component.css";

import {BrowserRouter} from "react-router-dom";
import Switch from "react-router-dom/es/Router";
import Link from "react-router-dom/modules/Link";
import Route from "react-router-dom/es/Route";

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
                            <Home />
                        </Route>
                        <Route path="/about">
                            <About />
                        </Route>
                        <Route path="/dashboard">
                            <Dashboard />
                        </Route>
                    </Switch>

            </div>
        </BrowserRouter>
);
}





