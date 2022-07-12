import React from "react";
import {io} from 'socket.io-client'

class App extends React.Component{
constructor(){
  super();
  this.socket=io('http://localhost:3001')

  this.socket.on("MESSAGE",(data)=>{
    console.log(data);

  })

  this.socket.on("BROADCAST",(data)=>{
    console.log(data);

})
this.socket.on("EXCLUSIVEBROADCAST",(data)=>{
  console.log(data);
})
this.socket.on("JOINROOMSUCCESS",(data)=>{
  console.log(data);
})
this.socket.on("SENDMESSAGEROOM",(data)=>{
  console.log(data);
})

}
sendMessage=()=>{
  this.socket.emit("MESSAGE","Message sent from app");
}
broadcastMessage=()=>{
  this.socket.emit("BROADCAST","BroadCast Message sent ");
}
exclusiveBroadcastMessage=()=>{
  this.socket.emit("EXCLUSIVEBROADCAST","EXCLUSIVEBroadCast Message sent ");
}
joinRoom=()=>{
this.socket.emit("JOINROOM","client joined the room");
}
sendMessageToRoom=()=>{
  this.socket.emit("SENDMESSAGEROOM","Room message sent");
}

  render(){
    return(
      <div className="App">
        <h1>SocketProgramming</h1>
        <button onClick={this.sendMessage}>SendMessage</button>
        <hr />

        <button onClick={this.broadcastMessage}>BroadCast</button>
        <hr />
        <button onClick={this.exclusiveBroadcastMessage}>ExclusiveBroadCast</button>
        <hr/>
        <button onClick={this.joinRoom}>JoinRoom</button>
        <hr/>
        <button onClick={this.sendMessageToRoom}>sendMessageToRoom</button>
      </div>
    )
  }
}

export default App;
