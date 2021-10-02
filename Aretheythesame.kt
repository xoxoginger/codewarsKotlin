/*Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, with the same multiplicities.
"Same" means, here, that the elements in b are the elements in a squared, regardless of the order.*/

fun comp(a: IntArray?, b: IntArray?): Boolean {
    if(a != null && b != null) {
        var asorted = a.sorted()
        var bsorted = b.sorted()
        //var flag = true

        if(a.size != b.size)
            return false

        for(i in 0..asorted.size-1) {
            if((asorted[i]*asorted[i]) != bsorted[i])
                return false
        }

        return true
    }
    else return false
}
