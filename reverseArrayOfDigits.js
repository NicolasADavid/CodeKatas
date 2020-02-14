function sol(a = 0){
    const arr = [];

    while(a>10) {
        arr.push(a%10)
        a = Math.floor(a/10)
    }

    arr.push(a%10)

    console.log(arr)
    return arr
}

sol(1234)
sol(543321)
sol()
sol(0)
sol(00000)
sol(005)
sol(0005000)

console.log("end")
