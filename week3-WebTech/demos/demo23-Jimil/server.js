import Book from './book.js';
//const express = require('express');
import express from 'express';

const server = express();

const bookArr = [];
bookArr.push(new Book('Book 1', 'Author 1', '12345'));
bookArr.push(new Book('Book 2', 'Author 2', '22345'));
bookArr.push(new Book('Book 3', 'Author 3', '32345'));
bookArr.push(new Book('Book 4', 'Author 4', '42345'));
bookArr.push(new Book('Book 5', 'Author 5', '52345'));

server.get("/bookArr", (req, res) => {
    res.setHeader('Content-Type', 'application/json');
    res.send(bookArr);
});
server.get("/bookArr/:isbn", (req, res) => {
    res.setHeader('Content-Type', 'application/json');
    const book = bookArr.find(b => b.isbn === req.params.isbn);

    if (book) {
        res.send(book);
    } else {
        res.status(404).send("Book not found!");
    }
});

server.listen(3000, () => {
    console.log("Server started");
});