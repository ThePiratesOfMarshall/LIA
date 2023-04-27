const net = require('net');
const port = 9090;
const ip = "127.0.0.1";

const server = new net.Server();
server.listen(port, ip, function() {
    console.log("Server in ascolto\nIp: " + ip + "\nPorta: " + port);
});

server.on("connection", function(socket) {
    console.log("Nuova connessione stabilita");

    socket.write("LEFT;FLASH_ON\n");

    socket.on("data", function(buffer) {
        console.log("Dati ricevuti dal client:\n" + buffer.toString());
    })
    
    socket.on("end", function() {
        console.log("Chiusura connessione con il client");
    })

    socket.on("error", function(err) {
        console.log("Errore: " + err);
    })
})
