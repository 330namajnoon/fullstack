const http = require("http");
const path = require("path");
const express = require("express");
const port = process.env.PORT || 5000;
const app = express();
const pdp = path.join(__dirname,"./html");
app.use(express.static(pdp));
const server = http.createServer(app);
const socketio = require("socket.io");
const io = socketio(server);
const fs = require("fs");
const e = require("express");
server.listen(port,()=> {
    console.log(`server is up on port${port}!`);
})

io.on("connection",(client)=> {
    console.log("new web connect");

    client.on("text_load",()=> {
        fs.readFile("./html/javascript/ajax/ajax.txt",(err,data) => {
            if(err) throw err;
            client.emit("text_load",data.toString(),data.toJSON);
        })
    })

    client.on("disconnect",()=> {
        console.log("new web disconnect");
    })
})