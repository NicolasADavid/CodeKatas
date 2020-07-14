//F5 to debug
function twoSum(arr, target) {

    let dict = {}

    for (i=0; i<arr.length; i++){

        let num = arr[i]

        let desired = target-num
        
        if(dict[desired] !== undefined){
            return [dict[desired], i]
        }
        
        dict[num] = i // num exists, and its index is i
    }

    return undefined
}

let arr1 = [1, 2, 3, 4, 5, 6, 7]
let arr2 = [1, 6, 3, 4, 5, 6, 7]

let res = twoSum(arr1, 10)
let res2 = twoSum(arr2, 10)

console.log()
