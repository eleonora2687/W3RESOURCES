const weekday = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];

const d = new Date();
let day = weekday[d.getDay()];

console.log('Today is: '+day);


var date = new Date("2024-05-30T13:38:51.01");


console.log('Current time is: '+date.getHours()+' PM: '+ 
date.getMinutes()+' :'
+date.getSeconds());