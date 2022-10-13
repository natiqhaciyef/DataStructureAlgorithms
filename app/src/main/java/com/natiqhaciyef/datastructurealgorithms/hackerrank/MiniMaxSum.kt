package com.natiqhaciyef.datastructurealgorithms.hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun getMax(arr: Array<Long>):Long{
    var max = arr[0]
    for (element in arr){
        if (element > max)
            max = element
    }
    return max
}

fun getMin(arr: Array<Long>): Long{
    var min = arr[0]
    for (element in arr){
        if (element < min)
            min = element
    }
    return min
}


fun miniMaxSum(arr: Array<Long>): Unit {
    val min = getMin(arr)
    val max = getMax(arr)
    val listMax = arr.toMutableList()
    val listMin = arr.toMutableList()

    println("${listMin.sum()-Math.abs(max)} ${listMax.sum()-Math.abs(min)}")
}


fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    miniMaxSum(arr)
}
