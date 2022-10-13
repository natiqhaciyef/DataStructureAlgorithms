package com.natiqhaciyef.datastructurealgorithms.hackerrank

fun main() {
    val list = mutableListOf(12, 14, 159, 43, 334, 99, 5, 37)
    val array = breakingRecords(list.toTypedArray())
}

fun breakingRecords(scores: Array<Int>): Array<Int> {
    val list = scores.toMutableList()
    var minScore = 0
    var maxScore = 0
    var min = list[0]
    var max = list[0]

    for (i in list.indices) {
        val custom = mutableListOf<Int>()
        for (j in 0..i) {
            custom.add(list[j])
        }
        if (min > findMinimum(custom)) {
            min = findMinimum(custom)
            minScore += 1
        } else if (max < findMaximum(custom)) {
            max = findMaximum(custom)
            maxScore += 1
        }
    }
    return arrayOf(maxScore, minScore)
}

fun findMinimum(scores: MutableList<Int>): Int {
    var temp = scores[0]
    for (i in scores) {
        if (i < temp) temp = i
    }
    return temp
}

fun findMaximum(scores: MutableList<Int>): Int {
    var temp = scores[0]
    for (i in scores) {
        if (i > temp)
            temp = i
    }
    return temp
}
