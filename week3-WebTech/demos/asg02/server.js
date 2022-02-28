import express from "express";
import { json } from "express";
import productsApp from "./app/productsApp/products.js";
import booksApp from "./app/booksApp/books.js";
import carsApp from "./app/carsApp/cars.js";
import personsApp from "./app/personsApp/persons.js";
import path from "path";

const __dirname = path.resolve(path.dirname(''));
const server = express();
const port = 3000;
const server_message = `Server started on port 3000`;

server.use(express.urlencoded({ extended: true }));
server.use(express.json());

// http://localhost:3000/
server.get('/', (req, resp) => {
    resp.setHeader('Content-Type', 'text/html');
    resp.sendFile(path.join(__dirname, 'index.html'));
});

server.use('/app', productsApp);
//server.use('/app', personsApp);
server.use('/app', carsApp);
//server.use('/app', booksApp);

server.listen(port, () => {
    console.log(server_message);
});