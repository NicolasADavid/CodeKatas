function solution(string){
    const arr = [];
    for(let i = 0; i <= string.length; i++){
        arr[string.length-i-1] = string.charAt(i);
    }
    return arr.join('');
}

var result = solution("world");
console.log(result);