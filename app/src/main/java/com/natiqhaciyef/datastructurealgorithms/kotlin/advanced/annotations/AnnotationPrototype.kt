package com.natiqhaciyef.datastructurealgorithms.kotlin.advanced.annotations

// Creating Annotation
@Target(AnnotationTarget.CLASS, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY)
annotation class AnnotationPrototype(val name: String)

@AnnotationPrototype("Programming languages") class ProgrammingLanguage{
    fun getHistory(){}
    @AnnotationPrototype("Kotlin") val name = ProgrammingLanguage::class.java.annotations
}


// Labeling
class MathematicalCalculation{
    fun matrixCalculator(){
        loop@ for(element in 0..3){
            for (subElement in 0..3){
                if (subElement > element)
                    break@loop
            }
        }
    }
}


fun main(){
    val kotlin = ProgrammingLanguage::class.java
    for (annotation in kotlin.annotations){
        println(annotation.annotationClass.simpleName)
    }

    println(kotlin.name)
}



// @Target
// @Retention
// @Repeatable
// @MustBeDocumented