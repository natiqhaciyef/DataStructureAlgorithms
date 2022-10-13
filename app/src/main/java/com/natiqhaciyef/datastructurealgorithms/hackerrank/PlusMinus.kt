package com.natiqhaciyef.datastructurealgorithms.hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun plusMinus(arr: Array<Int>): Unit {
    var pos = 0.0
    var neg = 0.0
    var zero = 0.0
    val n = arr.size

    for(element in arr){
        if(element > 0){
            pos ++
        } else if(element < 0){
            neg ++
        } else{
            zero ++
        }
    }

    println(pos/n)
    println(neg/n)
    println(zero/n)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
