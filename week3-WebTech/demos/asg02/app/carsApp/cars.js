import express from "express";

const carsApp = express.Router();

const cars = [];
cars.push({ 'cid': 'C101', 'cname': 'Car 1', 'cmodel': 'Model 1', 'price': '10L' });
cars.push({ 'cid': 'C102', 'cname': 'Car 2', 'cmodel': 'Model 2', 'price': '8L' });
cars.push({ 'cid': 'C103', 'cname': 'Car 3', 'cmodel': 'Model 3', 'price': '15L' });
cars.push({ 'cid': 'C104', 'cname': 'Car 4', 'cmodel': 'Model 1', 'price': '10L' });


// http://localhost:3000/app/cars
carsApp.get('/cars', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    resp.send(cars);
});

// http://localhost:3000/app/cars/:cid
carsApp.get('/cars/:cid', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    const cid = req.params.cid;
    const car = cars.find(c => c.cid === cid);
    if (car)
        resp.send(car);
    else
        resp.status(404).send(cid + " Not Found on Server");
});

// http://localhost:3000/app/cars/:cid/:price
carsApp.put('/cars/:cid/:price', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    const cid = req.params.cid;
    const car = cars.find(c => c.cid === cid);
    if (car) {
        car.price = req.params.price;
        //car.cname = req.params.cname;
        //car.cmodel = req.params.cmodel;
        resp.send(JSON.stringify(car) + " updated with new price");
    }
    else {
        resp.status(404).send(cid + " No product found");
    }
});

// http://localhost:3000/app/cars/:cid
carsApp.delete('/cars/:cid', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    const cid = req.params.cid;
    cars.forEach(car => {
        if (car.cid === req.params.cid) {
            cars.pop();
        }
    });
});

// http://localhost:3000/app/cars/add
carsApp.post('/cars/add', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    const newCar = { "cid": req.body.cid, "cname": req.body.cname, "cmodel": req.body.cmodel, "price": req.body.price };
    if (newCar) {
        const n = cars.push(newCar);
        if (n > 0) resp.send(JSON.stringify(newCar) + " added in products record");
        else resp.status(500).send(JSON.stringify(newCar) + " not added in record")
    }
});

export default carsApp;

/*export default class Cars {
    constructor(cid, cname, cmodel, price) {
        this.cid = cid;
        this.cname = cname;
        this.cmodel = cmodel;
        this.price = price;
    }
}*/