package com.natiqhaciyef.datastructurealgorithms.hackerrank

fun main() {
    val list = mutableListOf(1,2,1,3,0)
    val d = 3
    val m = 2
    println(arraySumOfSegments(list, d, m))
//    arraySumOfSegments(list, d, m)
}

fun birthday(s: Array<Int>, d: Int, m: Int) {
    val list = s.toMutableList()
    arraySumOfSegments(list,d,m)
}

fun arraySumOfSegments(list: MutableList<Int>, d: Int, m: Int): Int {
    var count = 0
    for (i in list.indices) {
        if (i + m <= list.size) {
            var a = 0
            for (j in i until i + m) {
                a += list[j]
            }
            if (a == d)
                count++
        }
    }
    return count
}