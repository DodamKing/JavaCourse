let x;
var y = 20;
var z;

console.log("x: " + x);
console.log("y: " + y);
console.log("z: " + z);
console.log("");

console.log("x의 타입: " + typeof(x));
console.log("y의 타입: " + typeof(y));
console.log("z의 타입: " + typeof(z));

z = 100.1;
console.log("");
console.log("z: " + z);
console.log("z의 타입: " + typeof(z));

x = "seoul";
console.log("");
console.log("x: " + x);
console.log("x의 타입: " + typeof(x));

x = "z";
console.log("");
console.log("x: " + x);
console.log("x의 타입: " + typeof(x));

y = new Date();
console.log("");
console.log("y: " + y);
console.log("y의 타입: " + typeof(y));

y = true;
console.log("");
console.log("y: " + y);
console.log("y의 타입: " + typeof(y));

y = [1,2,3];
console.log("");
console.log("y: " + y);
console.log("y의 타입: " + typeof(y));

y = {a:1, b:2, c:"한글"};
console.log("");
console.log("y: " + y);
console.log("y의 타입: " + typeof(y));