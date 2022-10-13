package com.natiqhaciyef.datastructurealgorithms.hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun getMax(arr: Array<Int>):Int{
    var max = arr[0]

    for (element in arr){
        if (element > max){
            max = element
        }
    }
    return max
}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var max = getMax(candles)
    var count = 0
    candles.forEach {
        if(it == max)
            count++
    }

    return count
}
fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
