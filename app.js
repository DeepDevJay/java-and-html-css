const express = require('express');

const server = express();

server.get('/', (req , res) =>{
    res.send('<h1>Hello world on Home page</h1>');
});

server.listen(3000 , () => {
    console.log('Express server is running on port 3000');
});