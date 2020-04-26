const squareEveryDigit = (input) => {
    let arr = [];
    let x = input;

    while(x>0){
        let j = x%10;
        x = Math.floor(x / 10);
        arr.push(j*j);
    }

    let result = 0;

    for(let i = 0; i < arr.length; i++){

        let k = arr[i];
        let j = 0;
        while(k>0){
            j++;
            k=Math.floor(k/10);
        }

        result = result * (Math.pow(10,j))
        result += arr[i]
    }

    return result
}
console.log(squareEveryDigit(9119))