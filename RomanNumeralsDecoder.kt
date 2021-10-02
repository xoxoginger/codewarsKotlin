/*Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer. You don't need to validate the form of the Roman numeral.

Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s. So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC) and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.*/


fun decode(str: String): Int {
    var current = 0 
    var previous = 0
    var arabic = 0

    for(i in 0 until str.length) {
        when(str[i]) {
            'I' -> current = 1
            'V' -> current = 5
            'X' -> current = 10
            'L' -> current = 50
            'C' -> current = 100
            'D' -> current = 500
            'M' -> current = 1000
        }
        
        if (current > previous) {
            arabic += current - (previous * 2)
        } 
        else {
            arabic += current
        }

        previous = current
    }
    
    return arabic
}
