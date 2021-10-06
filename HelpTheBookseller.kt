/*
A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. 
Each book has a code c of 3, 4, 5 or more characters. The 1st character of a code is a capital letter which defines the book category.

In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0) which indicates the quantity of books of this code in stock.

For example an extract of a stocklist could be:

L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
or
L = ["ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"] or ....
You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :

M = {"A", "B", "C", "W"} 
or
M = ["A", "B", "C", "W"] or ...
and your task is to find all the books of L with codes belonging to each category of M and to sum their quantity according to each category.

For the lists L and M of example you have to return the string :

(A : 20) - (B : 114) - (C : 50) - (W : 0)


If L or M are empty return string is "".
*/

fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
        
        var result = ""
        
        if(lstOfArt.isEmpty())
            return ""
        
        for(i in 0 until lstOfCat.size) {
            var count = 0
            result += "(" + lstOfCat[i] + " : "
            for(art in lstOfArt) {
                if(art[0] == lstOfCat[i].first())
                {
                    count+=(art.replace(Regex("[^0-9]"), "")).toInt()
                }
            }
            if(count == 0)
                result += "0"
            else
                result += count.toString()
            if(i != lstOfCat.size-1)
                result += ") - "
            else
                result += ")"
        }
        return result
    }
