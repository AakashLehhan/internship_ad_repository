import express from "express";

const productsApp = express.Router();

const product_list = [];
product_list.push({ "pid": "P101", "pname": "Pepsi 500ml", "unitPrice": 30.0 });
product_list.push({ "pid": "P102", "pname": "Thumsup 500ml", "unitPrice": 30.0 });
product_list.push({ "pid": "P103", "pname": "Sprite 500ml", "unitPrice": 30.0 });

// http://localhost:3000/app/products
productsApp.get('/products', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    resp.send(product_list);
});

// http://localhost:3000/app/products/:pid
productsApp.get('/products/:pid', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    const pid = req.params.pid;
    const product = product_list.find(p => p.pid === pid);
    if (product)
        resp.send(product);
    else
        resp.status(404).send(pid + " Not Found on Server");
});

// http://localhost:3000/app/products/:pid/:unit_price
productsApp.put('/products/:pid/:unitPrice', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    const pid = req.params.pid;
    const product = product_list.find(p => p.pid === pid);
    if (product) {
        product.unitPrice = req.params.unitPrice;
        resp.send(JSON.stringify(product) + " updated with new price");
    }
    else {
        resp.status(404).send(pid + " No product found");
    }
});

// http://localhost:3000/app/products/:pid
productsApp.delete('/products/:pid', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    const pid = req.params.pid;
    product_list.forEach(product => {
        if (product.pid === pid) {
            product_list.pop();
        }
    });
});

// http://localhost:3000/app/products/add
productsApp.post('/products/add', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    const newProduct = { "pid": req.body.pid, "pname": req.body.pname, "unitPrice": req.body.unit_price }
    if (newProduct) {
        const n = product_list.push(newProduct);
        if (n > 0) resp.send(JSON.stringify(newProduct) + " added in products record");
        else resp.status(500).send(JSON.stringify(newProduct) + " not added in record")
    }
});

export default productsApp;

/*export default class Products {
    constructor(pid, pname, unitPrice) {
        this.pid = pid;
        this.pname = pname;
        this.unitPrice = unitPrice;
    }
}*/