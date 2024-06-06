// 1. Write a JavaScript program to display the current day and time in the following format.  
// Sample Output : Today is : Tuesday.
// Current time is : 10 PM : 30 : 38


/* const weekday = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];

const d = new Date();
let day = weekday[d.getDay()];

console.log('Today is: '+day);


var date = new Date("2024-05-30T13:38:51.01");


console.log('Current time is: '+date.getHours()+' PM: '+ 
date.getMinutes()+' :'
+date.getSeconds()); */


// 3. Write a JavaScript program to get the current date.
// Expected Output :
// mm-dd-yyyy, mm/dd/yyyy or dd-mm-yyyy, dd/mm/yyyy


/* const today = new Date();

let dd = today.getDate();
let mm = today.getMonth() + 1;
const yyyy = today.getFullYear();

if (dd < 10)
{
    dd = '0' + dd;
}

if (mm < 10)
{
    mm = '0' + mm;
}

console.log(dd + '-' + mm + '-' + yyyy);

console.log(dd + '/' + mm + '/' + yyyy);

console.log(mm + '-' + dd + '-' + yyyy);

console.log(mm + '/' + dd + '/' + yyyy); */




// 4. Write a JavaScript program to find the area of a triangle where three sides are 5, 6, 7.  


/* var a = 5;
var b = 6;
var c = 7;

let s = (a + b + c)/2;

console.log(Math.sqrt(s*(s-a)*(s-b)*(s-c))); */