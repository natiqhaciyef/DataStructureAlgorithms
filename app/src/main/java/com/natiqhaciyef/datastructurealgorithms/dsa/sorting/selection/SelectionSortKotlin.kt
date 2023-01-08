package com.natiqhaciyef.datastructurealgorithms.dsa.sorting.selection



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
