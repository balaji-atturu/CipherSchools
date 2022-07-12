document.getElementById("demo").innerHTML = 5 + 6;
document.write(5 + 6);
window.alert(5 + 6);
alert(5 + 6);
console.log(5 + 6);
<button onclick="window.print()">Print this page</button>

<p id="demo"></p>

<script>
let x, y, z;  // Statement 1
x = 5;        // Statement 2
y = 6;        // Statement 3
z = x + y;    // Statement 4

document.getElementById("demo").innerHTML =
"The value of z is " + z + ".";  
</script>

document.getElementById("demo").innerHTML = "Hello Dolly.";
c = a + b;
document.getElementById("demo1").innerHTML = c;
</script>

<button type="button" onclick="myFunction()">Click Me!</button>

<p id="demo1"></p>
<p id="demo2"></p>

<script>
function myFunction() {
  document.getElementById("demo1").innerHTML = "Hello Dolly!";
  document.getElementById("demo2").innerHTML = "How are you?";
}
</script>

<p id="demo"></p>

<script>
carName = "Volvo";
document.getElementById("demo").innerHTML = carName;
var carName;
</script

const PI = 3.14159265359;
As a general rule, always declare a variable with const unless you know that the value will change.

Use const when you declare:

A new Array
A new Object
A new Function
A new RegExp
Declaring a variable with const is similar to let when it comes to Block Scope.


let x = 16 + 4 + "Volvo";
let x = "Volvo" + 16 + 4;
let car = "";    // The value is "", the typeof is "string"

<!DOCTYPE html>
<html>
<body>

<h2>JavaScript Functions</h2>

<p>This example calls a function which performs a calculation, and returns the result:</p>

<p id="demo"></p>

<script>
function myFunction(p1, p2) {
  return p1 * p2;
}
document.getElementById("demo").innerHTML = myFunction(4, 3);
</script>

</body>
</html>

function toCelsius(fahrenheit) {
  return (5/9) * (fahrenheit-32);
}
document.getElementById("demo").innerHTML = toCelsius(77);

objectName.propertyName
objectName["propertyName"]

<element event="some JavaScript">

onclick="document.getElementById('demo').innerHTML=Date()">The time is?</button>
<button onclick="this.innerHTML = Date()">The time is?</button>
<button onclick="displayDate()">The time is?</button>

let length = text.length;
let text = "We are the so-called \"Vikings\" from the north.";
let text= 'It\'s alright.';
let text = "The character \\ is called backslash.";
document.getElementById("demo").innerHTML = "Hello " +
"Dolly!";
let x = "John";

// y is an object
let y = new String("John");

document.getElementById("demo").innerHTML =
typeof x + "<br>" + typeof y;
</script>
When using the === operator, x and y are not equal:
slice(start, end)
substring(start, end)
substr(start, length)
str.slice(-12, -6);
 document.getElementById("demo").innerHTML =
  text.replace("Microsoft","W3Schools");
text.replace("MICROSOFT", "W3Schools");
text.replace(/MICROSOFT/i, "W3Schools");
text.replace(/Microsoft/g, "W3Schools");
text1.toUpperCase();

text1.concat(" ", text2);
text = "Hello" + " " + "World!";
text = "Hello".concat(" ", "World!");
let text1 = "      Hello World!      ";
let text2 = text1.trim();
text.padStart(4,0);0005
text.padEnd(4,0);5000
text.charAt(0);
text.charCodeAt(0);
let char = text[0];

A string can be converted to an array with the split() method:
<script>
let text = "a,b,c,d,e,f";
const myArray = text.split(",");
document.getElementById("demo").innerHTML = myArray[0];
</script>
str.indexOf("locate");
The lastIndexOf() method returns the index of the last occurrence of a specified text in a string:

str.indexOf("locate", 15);

str.search("locate");
text.match(/ain/g);
text.match(/ain/gi);
text.includes("world");
text.includes("world", 12);
text.startsWith("Hello");
text.startsWith("world", 5)    // Returns false
text.endsWith("Doe");
Check in the 11 first characters of a string ends with "world":

let text = "Hello world, welcome to the universe.";
text.endsWith("world", 11);
Template Literals use back-ticks (``) rather than the quotes ("") to define a string:
let text = `He's often called "Johnny"`;

let text = `Welcome ${firstName}, ${lastName}!`;
let x = 123e5;    // 12300000
let y = 123e-5;   // 0.00123


let x = 10;
let y = 20;
let z = "The result is: " + x + y; 1020
let x = 10;
let y = 20;
let z = "30";
let result = x + y + z;30 30

let x = "100";
let y = "10";
let z = x + y;reamining will work fine
10010

<p id="demo"></p>

<script>
let x = 100 / "Apple";
document.getElementById("demo").innerHTML = isNaN(x);
</script>

</body>
</html>

Watch out for NaN. If you use NaN in a mathematical operation, the result will also be NaN:
Or the result might be a concatenation like NaN5:
Infinity is a number: typeof Infinity returns number.

let x = 123;
x.toString();
let x = 9.656;
x.toExponential(2);9.66e+0
The toFixed() method rounds a number to a given number of digits.
let x = 9.656;
x.toFixed(0);10
x.toFixed(2);9.66
let x = 9.656;
x.toPrecision();9.656
9.7
x.toPrecision(2);

The valueOf() method returns a number as a number:

123let x = 123;
x.valueOf();
(123).valueOf();
(100 + 23).valueOf();
123
123

<script>
document.getElementById("demo").innerHTML = 
  Number(true) + "<br>" +
  Number(false) + "<br>" +
  Number("10") + "<br>" + 
  Number("  10") + "<br>" +
  Number("10  ") + "<br>" +
  Number(" 10  ") + "<br>" +
  Number("10.33") + "<br>" + 
  Number("10,33") + "<br>" +
  Number("10 33") + "<br>" +
  Number("John");
</script>

</body>
</html>
The Number() method converts variables to numbers:

1
0
10
10
10
10
10.33
NaN
NaN
NaN
let x = new Date("1970-01-01");
document.getElementById("demo").innerHTML = Number(x);
parseInt("years 10"); NAN
parseFloat("10 years");10
parseFloat("years 10");NAn
let x = Number.MAX_VALUE;
let x = Number.MIN_VALUE;

<script>Opel,Volvo,BMW
const cars = ["Saab", "Volvo", "BMW"];
cars[0] = "Opel";
document.getElementById("demo").innerHTML = cars;
</script>
let length = fruits.length;
let fruit = fruits[fruits.length - 1];Accessing the Last Array Element















