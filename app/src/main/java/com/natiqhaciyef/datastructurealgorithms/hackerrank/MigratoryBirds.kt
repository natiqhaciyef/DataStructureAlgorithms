package com.natiqhaciyef.datastructurealgorithms.hackerrank

import java.util.*
import kotlin.collections.ArrayList

object MigratoryBirdsSolution1{
    fun migratoryBirds(arr: Array<Int>): Int {
        val list = arr.toMutableList()
        var a = 0

        for (element in list){
            if (a < counterOfElementInList(list, element))
                a = counterOfElementInList(list, element)
        }

        return findNumberOfRepeated(list, a).getMin()
    }

    private fun ArrayList<Int>.getMin(): Int{
        var a = this[0]
        for (element in this){
            if (a > element)
                a = element
        }
        return a
    }


    fun counterOfElementInList(list: MutableList<Int>, element: Int): Int{
        var a = 0
        for (e in list){
            if (e == element)
                a++
        }
        return a
    }


    fun findNumberOfRepeated(list: MutableList<Int>, count: Int): ArrayList<Int>{
        var a = ArrayList<Int>()
        for (element in list){
            if (count == counterOfElementInList(list,element))
                a.add(element)
        }
        return a
    }
}

object MigratoryBirdsSolution2 {
    fun migratoryBirds(arr: Array<Int>): Int {
        var counter1 = 0
        var counter2 = 0
        var counter3 = 0
        var counter4 = 0
        var counter5 = 0
        val typesId: MutableList<Int> = ArrayList()
        typesId.add(0)
        typesId.add(0)
        typesId.add(0)
        typesId.add(0)
        typesId.add(0)
        for (i in arr.indices) {
            if (arr[i] == 1) {
                counter1++
                typesId[0] = counter1
            } else if (arr[i] == 2) {
                counter2++
                typesId[1] = counter2
            } else if (arr[i] == 3) {
                counter3++
                typesId[2] = counter3
            } else if (arr[i] == 4) {
                counter4++
                typesId[3] = counter4
            } else if (arr[i] == 5) {
                counter5++
                typesId[4] = counter5
            }
        }
        var max = 0
        var mostFreq = 0
        for (j in 0..4) {
            if (max < typesId[j]) {
                max = typesId[j]
                mostFreq = j + 1
            }
        }
        return mostFreq
    }
}