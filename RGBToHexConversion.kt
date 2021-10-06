/* 
The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. 
Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

The following are examples of expected output values:

rgb(255, 255, 255) // returns FFFFFF
rgb(255, 255, 300) // returns FFFFFF
rgb(0, 0, 0) // returns 000000
rgb(148, 0, 211) // returns 9400D3 
*/

fun divide(num: Int): Int = (num / 16).toInt()
    
fun multi(num: Int): Int = ((num / 16.0 - (num / 16.0).toInt()) * 16).toInt()

fun letterOrNum(char: Int): String = 
    when(char) {
        10 -> "A"
        11 -> "B"
        12 -> "C"
        13 -> "D"
        14 -> "E"
        15 -> "F"
        else -> char.toString()
    }

fun rgb(rval: Int, gval: Int, bval: Int): String {
    var result: String = ""
    var r = rval
    var g = gval
    var b = bval
    if(r < 0) r = 0 else if (r > 255) r = 255
    if(g < 0) g = 0 else if (g > 255) g = 255
    if(b < 0) b = 0 else if (b > 255) b = 255
    
    result += letterOrNum(divide(r)) + letterOrNum(multi(r)) + letterOrNum(divide(g)) + letterOrNum(multi(g)) + letterOrNum(divide(b)) + letterOrNum(multi(b))
    
    return result
}
