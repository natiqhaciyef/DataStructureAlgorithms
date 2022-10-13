package com.natiqhaciyef.datastructurealgorithms.hackerrank

import kotlin.io.*
import kotlin.text.*


fun timeConversion(ss: String): String {
    var s = ss
    if (s.endsWith("AM")){
        s = s.removeRange(s.lastIndex-1..s.lastIndex)
        if (s.startsWith("12")){
            s = s.removeRange(0..1)
            s = "00$s"
        }
    } else if (s.endsWith("PM")){
        if (s.startsWith("12")){
        }else {
            val sum = (s.substring(0..1).toInt() + 12).toString()
            s = s.removeRange(0..1)
            s = "$sum$s"
        }
        s = s.removeRange(s.lastIndex-1..s.lastIndex)
    }
    return s
}
//07:05:45PM

fun main(args: Array<String>) {
    val s = readLine()!!
    val result = timeConversion(s)

    println(result)
}
