function addition(n1, n2) {
    let result = n1 + n2;
    console.log(n1 + " + " + n2 + " = " + result);
}
function subtraction(n1, n2) {
    const result = n1 - n2; //most efficient incase if the value isn't gona change in future
    console.log(n1 + " - " + n2 + " = " + result);
}

addition(10, 20);
subtraction(10, 20);