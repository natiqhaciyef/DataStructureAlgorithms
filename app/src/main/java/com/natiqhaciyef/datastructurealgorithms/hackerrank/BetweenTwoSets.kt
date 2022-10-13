package com.natiqhaciyef.datastructurealgorithms.hackerrank


fun main(){
    println(firstArray(arrayOf(2,6), arrayOf(24,36)))
//    firstArray(arrayOf(2,6))
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var total = getDiv(a, b)
    return total
}

fun getDiv(a: Array<Int>, b: Array<Int>): Int{
    val list = firstArray(a, b)
    var mainTemp = 0
    for (element in list){
        var temp = 0
        for (number in b){
            if (number % element == 0)
                temp += 1
        }
        if (temp >= b.size)
            mainTemp += 1
    }
    return mainTemp
}

fun getSmallerIntFromArray(b: Array<Int>): Int{
    var temp = b[0]

    for (element in b){
        if (temp > element)
            temp = element
    }
    return temp
}

fun firstArray(a: Array<Int>, b: Array<Int>): MutableList<Int>{
    val list = mutableListOf<Int>()

    for (x in 1..getSmallerIntFromArray(b)){
        var count = 0
        var temp = 0
        for (element in a){
//            println("X : $x")
//            println("Element : $element")
            if (x % element == 0) {
                count = x
                temp += 1
            }
//            println("Count : $count")
//            println("Temp : $temp")
        }
        if (temp >= a.size)
            list.add(count)
    }
    return list
}


