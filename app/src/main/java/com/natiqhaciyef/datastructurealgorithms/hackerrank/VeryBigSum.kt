package com.natiqhaciyef.datastructurealgorithms.hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun aVeryBigSum(ar: Array<Long>): Long {
    var a = 0L
    for(element in ar){
        a += element
    }
    return a
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
