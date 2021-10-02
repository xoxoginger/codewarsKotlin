/*Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, 
which is the number of times you must multiply the digits in num until you reach a single digit.
For example:

persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                       // and 4 has only one digit
*/

fun persistence(num: Int) : Int {
    var count = 0
    var n = num
    while (n >= 10) {
        var res = 1;
        while(n > 0) {
            res *= n % 10
            n /= 10
        }
        n = res
        count++
    }
    return count
}
