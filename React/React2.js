import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import React2 from './index.js'
//import App from './App';
//import App from './App;
//import * as serviceWorker from './serviceWorker';

var element=React.createElement('h1',{ className: 'greeting' }, 'Hello,World!');
ReactDOM.render(element,document.getElementById('root'));
//seviceWorker.unregister();
//export default App;
export default React2;
