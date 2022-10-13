package com.natiqhaciyef.datastructurealgorithms.dsa

class Util {
    fun findLessNumberFromList(list: ArrayList<Int>): Int{
        var temp = list[0]

        for (element in list){
            if (temp > element)
                temp = element
        }
        return temp
    }
}