function add(n1, n2) {
    return n1 + n2;
}
function sub(n1, n2) {
    return n1 - n2;
}
function mul(n1, n2) {
    return n1 * n2;
}
function div(n1, n2) {
    return n1 / n2;
}

function calc(operation, n1, n2) {
    console.log(operation(n1, n2));
}
const n1 = 10, n2 = 20;
calc(add, n1, n2);
calc(sub, n1, n2);
calc(mul, n1, n2);
calc(div, n1, n2);