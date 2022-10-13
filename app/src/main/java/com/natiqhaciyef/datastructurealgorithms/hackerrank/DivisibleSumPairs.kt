package com.natiqhaciyef.datastructurealgorithms.hackerrank

fun main() {
    val list = mutableListOf(1,3,2,6,1,2)
//    println(countPairs(3,list))
    countPairs(3, list)
}

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    val list = ar.toMutableList()
    return countPairs(k, list)
}


fun countPairs(k: Int, list: MutableList<Int>): Int{
    var count = 0
    for (i in list.indices){
        for (j in i until list.size){
            if ((list[i] + list[j]) % k == 0 && j != i) {
                count += 1
                println("${list[i]} ${list[j]}")
            }
        }
    }

    return count
}