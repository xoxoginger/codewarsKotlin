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
