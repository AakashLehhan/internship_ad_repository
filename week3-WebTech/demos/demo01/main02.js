// Variables use keyword var
console.log(message);//undefined
var message="Welcome to JavaScript!"; // declaration and initialzation
// Variables use keyword let

function f1(){
    console.log("inseide f1() outer variable before reassigning value : "+num1);
    num1=2222; // intialized with some other  value 
    console.log("inside f1() outer variable after reassigning value: "+num1);
}
var num1=2000;
console.log("Before function call: "+num1);
f1();
console.log("After function call : "+num1);

//Below code is performed in developer tools
v1=10000;
	//10000
console.log(v1)
	//VM700:1 10000
	//undefined
function f1(){
    console.log("v1"+v1);
    v1=v1+1000;
    console.log("after v1=v1+1000 ="+v1);
}
	///undefined
console.log("Before f1()"+v1);
	//VM1220:1 Before f1()10000
	//undefined
f1();
	//VM1086:2 v110000
	//VM1086:4 after v1=v1+1000 =11000
	//undefined
console.log("Before f1()"+v1);
	//VM1256:1 Before f1()11000
	//undefined
    