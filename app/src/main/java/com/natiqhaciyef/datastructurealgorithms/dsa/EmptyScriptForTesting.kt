package com.natiqhaciyef.datastructurealgorithms.dsa

import com.natiqhaciyef.datastructurealgorithms.dsa.sorting.bubble.BubbleSortJava
import com.natiqhaciyef.datastructurealgorithms.dsa.sorting.bubble.bubbleSort
import com.natiqhaciyef.datastructurealgorithms.dsa.sorting.selection.selectionSort

fun main() {
    val list = arrayListOf(1,14,12,8,25,33,2,17,54)
    println("Sorted array")
    println(list.selectionSort())
    println(list.bubbleSort())
    println(BubbleSortJava.bubbleSort(list))
}