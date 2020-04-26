encryptThis = text => {
    if (text === "") {
      return ""
    }
    return text.split(" ").map(word => {
      let start = word.charCodeAt(0).toString(10)
      let middle = word[word.length - 1]
      let remain = word.slice(2, word.length - 1)
      let end = word[1]
      switch (word.length) {
        case 1: return start
        case 2: return start + end
        case 3: return start + middle + end
        default: return start + middle + remain + end
      }
    }).join(" ")
}
console.log(encryptThis("Hello there friend"))