package com.natiqhaciyef.datastructurealgorithms.dsa


fun ArrayList<Int>.selectionSort(): ArrayList<Int> {
    val res = this

    for (i in res.indices) {
        var minIndex = i
        for (j in i + 1 until res.size) {
            if (res[j] < res[minIndex])
                minIndex = j
            val temp = res[minIndex]
            res[minIndex] = res[i]
            res[i] = temp
        }
    }
    return res
}

fun ArrayList<Int>.bubbleSort(): ArrayList<Int> {
    val res = this
    for (i in res.indices) {
        for (j in 0 until res.size - i - 1) {
            if (res[j] > res[j + 1]) {
                val temp = res[j]
                res[j] = res[j + 1]
                res[j + 1] = temp
            }
        }
    }
    return res
}
