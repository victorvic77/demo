import React, { Component } from "react";
import s from "./app.component.css";
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom";


export default function BasicExample() {
    return (
        <Router>
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
                    /ul>

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
        </Router>
);
}


class MyComponent extends Component {
    render() {
        return <div className={s.intro}>Hello Victor. You are Great.</div>;
    }
}

export default MyComponent;