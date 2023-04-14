function getLength(params) {

    arrayToReturn = []

    for (let index = 0; index < arr.length; index++) {
        length = arr[index].length;
        arrayToReturn.push(length)
    }

    return arrayToReturn;
}


arr = ["05241", "0", "000111224", "24", "098765"]
console.log(getLength(arr))

