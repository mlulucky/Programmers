const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    const num = Number(input[0]);
    
    for(let i=0; i<num; i++) { 
        let star = '*';
        for(let j=0; j<i; j++) { 
            star += '*';
        }
        console.log(star);
    }
});

// 또는 문자열.repeat(반복횟수) 사용하면 됨