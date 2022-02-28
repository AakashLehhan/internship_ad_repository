import express from "express";

const app = express.Router();
const products = [{ "pid": "P101", "pname": "Product Name", "price": 20 }];

app.get('/products', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    resp.send(products);
});
app.get('/products/:id', (req, resp) => {
    const pid = req.params.pid;
    resp.setHeader('Content-Type', 'application/json');
    resp.send(products.find(p => p.pid == pid));
});
app.post('/products/add', (req, resp) => {
    const pid = req.body.pid;
    const pname = req.body.pname;
    const price = req.body.price;

    resp.setHeader('Content-Type', 'application/json');
    if (products.push({ "pid": pid, "pname": pname, "price": price } > 0)) {
        resp.send("New product added!");
    } else {
        resp.status(500).send({ message: "Product not added!" });
    }
});
app.put('/products/update/:id/:unit_price', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');

});
app.delete('/products/delete/:id', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');

    const pid = req.params.pid;
    products.find(product => {
        if (product.pid === pid) {
            products.pop();
            resp.send("Product deleted!");
        } else {
            resp.send("Product not found!");
        }
    });
});

export default app;