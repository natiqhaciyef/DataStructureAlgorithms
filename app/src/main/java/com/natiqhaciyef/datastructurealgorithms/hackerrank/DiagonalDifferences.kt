package com.natiqhaciyef.datastructurealgorithms.hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*


fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var left = 0
    var right = 0
    val n = arr.size

    for (i in arr.indices){
        left += arr[i][i]
        right += arr[i][n-i-1]
    }

    return Math.abs(left - right)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
