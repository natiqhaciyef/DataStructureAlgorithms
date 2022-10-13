package com.natiqhaciyef.datastructurealgorithms.hackerrank


fun rounder(i: Int): Int{
    var a = i
    return if (a%5 == 0)
        a
    else if (a%5 in 3..4){
        while (a%5 != 0) { a += 1 }
        a
    }else
        a
}

fun checkPoint(i: Int) = i > 37

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val list = arrayListOf<Int>()
    for (point in grades){
        if (checkPoint(point))
            list.add(rounder(point))
        else
            list.add(point)
    }
    return list.toTypedArray()
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)
    println(result.joinToString("\n"))
}
