const express = require('express');
const server = express();
const port = 3000;
const message = `http://localhost:${port} started`;


server.get('/', (req, resp) => {
    resp.sendFile(__dirname + '/index.html');
});
server.get('/index.html', (req, resp) => {
    resp.sendFile(__dirname + '/index.html');
});
server.get('/aboutus.html', (req, resp) => {
    resp.sendFile(__dirname + '/aboutus.html');
});
server.get('/contactus.html', (req, resp) => {
    resp.sendFile(__dirname + '/contactus.html');
});
server.get('/signin.html', (req, resp) => {
    resp.sendFile(__dirname + '/signin.html');
});
server.get('/signup.html', (req, resp) => {
    resp.sendFile(__dirname + '/signup.html');
});
server.get('/welcome.html', (req, resp) => {
    resp.sendFile(__dirname + '/welcome.html');
});
server.get('/style.css', (req, resp) => {
    resp.sendFile(__dirname + '/css/style.css');
});
server.get('/signup.js', (req, resp) => {
    resp.sendFile(__dirname + '/js/signup.js');
});

server.listen(port, () => {

});