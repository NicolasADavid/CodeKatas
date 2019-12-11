function capitalize(string){
    const startLow = [];
    const startHigh = [];

    for(let i = 0; i < string.length; i++){

        if(i%2==0){
            startLow[i] = string.charAt(i).toUpperCase();
            startHigh[i] = string.charAt(i);
        } else {
            startLow[i] = string.charAt(i);
            startHigh[i] = string.charAt(i).toUpperCase();
            
        }
    }

    // return startLow.join('');
    return [startLow.join(''), startHigh.join('')];
    
}
console.log(capitalize("abcdef"))




