package com.natiqhaciyef.datastructurealgorithms.utilkit

fun main() {
    val a = "natiq".setFirstIndexUpper()
    println(a)
}

fun String.setFirstIndexUpper(): String{
    return "${this[0].uppercase()}${this.removeRange(0..0)}"
}