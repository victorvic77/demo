import 'bootstrap/dist/css/bootstrap.css';

import React, {Component} from 'react';
//import s from "./app.component.css";


class FormContainer extends React.Component {


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
                            <button type="button" className="btn btn-danger">Block level button
                            </button>
                        </div>
                    </div>

                </div>



            </div>
        );
    }
}
export default FormContainer;