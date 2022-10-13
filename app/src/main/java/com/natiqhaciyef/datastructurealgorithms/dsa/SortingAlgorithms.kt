package com.natiqhaciyef.datastructurealgorithms.dsa

class SortingAlgorithms {
    fun selectionSorting(list: ArrayList<Int>): ArrayList<Int>{
        val sortedList = arrayListOf<Int>()
        val util = Util()

        for(i in list.indices){
            sortedList.add(util.findLessNumberFromList(list))
            list.remove(util.findLessNumberFromList(list))
        }

        return sortedList
    }
}
