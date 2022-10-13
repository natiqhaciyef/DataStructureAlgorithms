package com.natiqhaciyef.datastructurealgorithms.hackerrank

import kotlin.io.*
import kotlin.text.*


fun staircase(n: Int): Unit {
    var s = " "
    var ans = ""

    for(i in 0..n-1){
        for (i in 0..n-i-2){
            print(" ")
        }
        for (i in 0..i){
            print("#")
        }
        println("")
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
