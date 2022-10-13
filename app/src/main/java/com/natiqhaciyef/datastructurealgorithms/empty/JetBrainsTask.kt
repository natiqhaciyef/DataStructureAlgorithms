package com.natiqhaciyef.datastructurealgorithms.empty


data class Value(val s: String)

fun equals1(v1: Value?, v2: Value?): Boolean {
    return v1 == v2
}

fun equals2(v1: Value?, v2: Value?): Boolean {
    return if (v1 != null && v2 != null)
        v1 == v2
    else v1 == null && v2 == null
}

fun main(args: Array<String>) {
//    equals1(Value("abc"), Value("abc"))// eq true
//    equals1(Value("abc"), null)// eq false
//    equals1(null, Value("abc"))// eq false
//    equals1(null, null)// eq true

    equals2(Value("abc"), Value("abc"))// eq true
    equals2(Value("abc"), null)// eq false
    equals2(null, Value("abc"))// eq false
    equals2(null, null)// eq true
}

fun <T> T.getName(name: String){
    println(name)
}

operator fun Int.minus(a: Int): Int = this - a
