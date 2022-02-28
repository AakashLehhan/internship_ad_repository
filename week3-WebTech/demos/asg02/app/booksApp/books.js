import express from "express";

const booksApp = express.Router();

const booksList = [{ "bid": "B101", "bname": "Book 1", "bauthor": "Author 1", "published": 2001 },
{ "bid": "B102", "bname": "Book 2", "bauthor": "Author 2", "published": 2005 },
{ "bid": "B103", "bname": "Book 3", "bauthor": "Author 3", "published": 2009 },
{ "bid": "B104", "bname": "Book 4", "bauthor": "Author 4", "published": 2010 }];

booksApp.get('/books', (req, resp) => {
    resp.setHeader('Content-Type', 'application/json');
    resp.send(booksList);
});

export default booksApp;

/*export default class Books {
    constructor(bid, bname, bauthor, published) {
        this.bid = bid;
        this.bname = bname;
        this.bauthor = bauthor;
        this.published = published;
    }
}*/