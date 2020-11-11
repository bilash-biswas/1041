var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var a = parseFloat(lines.shift());
var b = parseFloat(lines.shift()); 

if(a === 0.0 && b === 0.0)
{
    console.log("Origem");
}
else if(a === 0.0 && b !== 0.0)
{
    console.log("Eixo Y");
}
else if(a !== 0.0 && b === 0.0)
{
    console.log("Eixo X");
}
else if(a > 0.0 && b > 0.0)
{
    console.log("Q1");
}
else if(a < 0.0 && b > 0.0)
{
    console.log("Q2");
}
else if(a < 0.0 && b < 0.0)
{
    console.log("Q3");
}
else
{
    console.log("Q4");
}
