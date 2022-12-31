package com.natiqhaciyef.datastructurealgorithms.utilkit


fun findLessNumberFromList(list: ArrayList<Int>): Int{
    var temp = list[0]

    for (element in list){
        if (temp > element)
            temp = element
    }
    return temp
}