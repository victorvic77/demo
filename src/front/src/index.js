import 'bootstrap/dist/css/bootstrap.css';
import React, { lazy, Suspense } from "react";
import ReactDOM from "react-dom";


//const App = lazy(() => import("./component/app.component"));
//ReactDOM.render(
//<Suspense fallback={<p>loading....</p>}>
//<App />
//</Suspense>,
//document.querySelector("#root")
//);


import App from "./app.component";
ReactDOM.render(<App />, document.querySelector("#root"));





// index.js
//console.log('hello from Node.js')

//const http = require('http')
//const hostname = '127.0.0.1'
//const port = 3000
//const server = http.createServer((req, res) => {
   // res.statusCode = 200
   // res.setHeader('Content-Type', 'text/plain')
   // res.end('Hello Victor. You are Great.\n')
//})
//server.listen(port, hostname, () => {
    //console.log(`Server running at http://${hostname}:${port}/`)
//})