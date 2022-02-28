import express from 'express';
import path from 'path';
import app from './app/app-route.js';

const server = express();
const __dirname = path.resolve(path.dirname(""));
const port = 3000;
const router = express.Router();

server.use(express.urlencoded({ extended: true }));
server.use(express.json);

//route is created i.e. http://localhost:3000/
server.get('/', (res, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    resp.status(200).send({ message: "Server is working at port 3000" });
});

//route is created i.e. http://localhost:3000/app
server.use('/app', app);

server.listen(port, () => { });