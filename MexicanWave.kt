/*In this simple Kata your task is to create a function that turns a string into a Mexican Wave. 
You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up. 

Rules:
 1.  The input string will always be lower case but maybe empty.

 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
 
Example:
wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}*/

fun wave(str: String): List<String> {
    var wave: MutableList<String> = mutableListOf()
    val strSplit = str.replace(" ", "")
    
    for(i in 0 until strSplit.length) {
        var count = 0
        var temp: String = ""
        
        for(charIndex in 0 until str.length) {
            print(count)
            if(str[charIndex] == ' ')
                temp += str[charIndex]
            if(str[charIndex].isLetter()) {
                if(count == i) {
                    temp += str[charIndex].toUpperCase() //uppercaseChar()
                    
                    }
                else
                    temp += str[charIndex]
                count++
            }
            print(" ")
            println(temp)
            
        }
        println(temp)
        wave.add(temp)
    }
    return wave
}
