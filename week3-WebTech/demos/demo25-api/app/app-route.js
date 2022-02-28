import express from "express";

const app = express.Router();

app.get('/products', (req, resp) => {
    resp.send(products);
});

export default app;