/*Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.*/

fun high(str: String) : String {
    val words = str.split(" ");
    var score = 0 
    var maxScore = 0
    var res: String = ""
    
    for(i in 0 until words.size) {
        for(char in words[i]) {
            score += (char.toByte().toInt() - 96)
        }
        if(score > maxScore) {
            maxScore = score
            res = words[i]
        }
        score = 0
    }
    return res  
}
