/*Your task is to construct a building which will be a pile of n cubes. 
The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.
You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?*/

fun findNb(m: Long): Long {
        var n: Long = 1;
        var mCopy: Long = m
        while(mCopy > 0L) {
            mCopy -= n*n*n
            n++
        }
        
        if(mCopy == 0L)
            return n-1
        else
            return -1
    }
