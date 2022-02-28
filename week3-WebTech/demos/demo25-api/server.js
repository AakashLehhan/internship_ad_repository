import express, { response } from "express";
import path from "path";
import app from "./app/app-route.js";

const port = 3000;
const message = `http://localhost:3000/ started`;
const __dirname = path.resolve(path.dirname(''));
const server = express();

server.use(express.urlencoded({ extended: true }));
server.use(express.json);
server.use('/app', app);

server.get('/', (req, reps) => {
    resp.send("Server is called!")
});