const http = require('http');
const fs = require('fs');
const port = 3000;
const serverMessage = `http://localhost:${port} started`;

function fetchFile(directory, content_type, resp) {
    fs.readFile(directory, (err, data) => {
        resp.setHeader('Content-Type', content_type)
        if(err) {
            resp.write(err);
        } else {
            resp.write(data);
        }
        resp.end();
    });
}

http.createServer((req, resp) => {
    const url = req.url;
    const method = req.method;

    switch(url) {
        case '/':
        case '/index.html':
            fetchFile(__dirname + '/index.html', 'text/html', resp);
            break;
        case '/contactus.html':
            fetchFile(__dirname + '/contactus.html', 'text/html', resp);
            break;
        case '/aboutus.html':
            fetchFile(__dirname + '/aboutus.html', 'text/html', resp);
            break;
        case '/signup.html':
            fetchFile(__dirname + '/signup.html', 'text/html', resp);
            break;
        case '/signin.html':
            fetchFile(__dirname + '/signin.html', 'text/html', resp);
            break;
        case '/style.css':
            fetchFile(__dirname + '/css/style.css', 'text/css', resp);
            break;
        default:
            resp.write('Content not found!');
            resp.end();
            break;
    }
}).listen(port, () => {
    console.log(serverMessage);
})