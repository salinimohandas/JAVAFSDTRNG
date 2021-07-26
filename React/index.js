import React from 'react';
import ReactDOM from 'react-dom';
import Toggle from './react6.js'
//import './index.css';
//import App from './App';
//import reportWebVitals from './reportWebVitals';


//var element = React.createElement('h1',{className:'greeting'},'Hello,Abhinav!');
////ReactDOM.render(element,document.getElementById('root'));
//export default App;


ReactDOM.render(
  <React.StrictMode>
<Toggle />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
//reportWebVitals();
