package com.natiqhaciyef.datastructurealgorithms.dsa.sorting.bubble


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
