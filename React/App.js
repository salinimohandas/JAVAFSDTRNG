import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import tick from ''
//import * as serviceWorker from './serviceWorker';

class Clock extends React.Component {
  render(){
    return(
      <div>
        <h1>Hello,World!</h1>
        <h2>It is{this.props.date.toLocaleTimeString()}.</h2>
      </div>  
      );

  }
}
function tick(){
  ReactDOM.render(
    <Clock date={new Date()}/>,
    document.getElementById('root')
  );
}
setInterval(tick,1000);
export default App;