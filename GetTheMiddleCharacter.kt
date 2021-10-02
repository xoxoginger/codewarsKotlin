/*You are going to be given a word. Your job is to return the middle character of the word. 
If the word's length is odd, return the middle character. 
If the word's length is even, return the middle 2 characters.*/

fun getMiddle(str : String) : String {
    if(str.length % 2 == 0) {
        return (str[str.length/2 - 1].toString() + str[str.length/2].toString())
    }
    else {
        if(str.length == 1)
            return str
        else {
            return str[str.length/2].toString()
        }
    }
}
