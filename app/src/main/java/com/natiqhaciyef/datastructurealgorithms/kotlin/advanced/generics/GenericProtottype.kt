package com.natiqhaciyef.datastructurealgorithms.kotlin.advanced.generics


open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(needsProcessed = true) {
    fun addChemicalCleaners() = apply { needsProcessed = false }
}

class FishStoreWater : WaterSupply(needsProcessed = false)

class LakeWater : WaterSupply(true) {
    fun filter() = apply { needsProcessed = false }
}

// Out type generics (T) only could return T type, no any function can take parameter type T
class Aquarium<out T : WaterSupply>(val waterSupply: T) {
    fun addWater(): T {
        check(!waterSupply.needsProcessed) { "water supply needs processed" }
        println("adding water from $waterSupply")
        return waterSupply
    }

    inline fun <reified R : WaterSupply> clue() = waterSupply is R    // reified type is runtime static type
}

// In type generics (T) only could insert T type parameters, no any function or value (also constructors) can
// return T type
class Cleaner<in T : WaterSupply>(private val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessed) { "water supply needs processed" }
        println("adding water from $waterSupply")
    }
}

// Star protection (<*>) is apply any type of Aquarium Generic and it will protecting way from the specify type
inline fun <reified N: WaterSupply> Aquarium<*>.getSupplyType() = waterSupply is N

fun main() {
    val aquarium1 = Aquarium<FishStoreWater>(FishStoreWater())
    aquarium1.addWater()

    val aquarium2 = Aquarium<TapWater>(TapWater())
    aquarium2.addWater()
}
