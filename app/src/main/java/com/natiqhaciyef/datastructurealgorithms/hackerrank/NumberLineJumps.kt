package com.natiqhaciyef.datastructurealgorithms.hackerrank

/*
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 */


fun main(){
    kangaroo(21 ,6 ,47 ,3)
}

fun kangaroo(xA: Int, v1: Int, xB: Int, v2: Int):String {
    var x1 = xA
    var x2 = xB

    return if (x1 > x2 && v1 > v2)
        "NO"
    else if (x1 < x2 && v1 < v2)
        "NO"
    else if ((v1 != v2 && x1 == x2) || (v1 == v2 && x1 != x2))
        "NO"
    else{
        while (x1 != x2){
            x1 += v1
            x2 += v2
            println("$x1 $x2")
            if (x1 == x2)
                return "YES"
            else if((v1>v2 && x1>x2) || (v1<v2 && x1<x2))
                return "NO"
        }
        return "NO"
    }
}



