package com.natiqhaciyef.datastructurealgorithms.hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */

fun fruitCounter(range: IntRange ,list: List<Int>): Int{
    var point = 0
    list.forEach {
        if (it in range){
            point += 1
        }
    }
    return point
}


fun fruitSumWithPoint(point: Int, list: List<Int>): ArrayList<Int>{
    val customList = arrayListOf<Int>()
    list.forEach {
        customList.add(it+point)
    }
    return customList
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    val sumPointListApple = fruitSumWithPoint(a, apples.toMutableList())
    val sumPointListOrange = fruitSumWithPoint(b, oranges.toMutableList())

    val applePoint = fruitCounter(s..t,sumPointListApple)
    val orangePoint = fruitCounter(s..t,sumPointListOrange)

    println(applePoint)
    println(orangePoint)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
