package com.natiqhaciyef.datastructurealgorithms.dsa.sorting.bubble

/** Documentation Bubble sorting (English)
Bubble sort starts to first two elements in the list, comparing them to check which one is greater.
If greater number on the left, then chosen two numbers changes places. And it continues comparing and place chancing
between the next two elements (second and third) until last element

    [1,4,2,7,5] -> [1,4,2,7,5]        1. 1 and 4
    [1,4,2,7,5] -> [1,2,4,7,5]        2. 4 and 2 (they changed places)
    [1,2,4,7,5] -> [1,2,4,7,5]        3. 4 and 7 (they changed places)
    [1,2,4,7,5] -> [1,2,4,5,7]        4. 7 and 5 (they changed places)
    [1,2,4,7,5] -> [1,2,4,5,7]        5. last check for correct results
*/

/** Bubble çeşidləmə alqoritminin dokumentasiyası
Bubble çeşidləmə cərgənin önündəki ilk 2 elementdən başlayır, onalrdan hansının böyük olduğunu tapmaq üçün müqayisə edir.
Əgər solda olan element böyük olarsa bu zaman onlar yerdəyişmə edirlər. Bu proses növbəti elementlər (2ci və 3cü element)
arasında baş verir, və proses sonuncu elementədək baş verir.

    [1,4,2,7,5] -> [1,4,2,7,5]        1. 1 and 4
    [1,4,2,7,5] -> [1,2,4,7,5]        2. 4 and 2 (they changed places)
    [1,2,4,7,5] -> [1,2,4,7,5]        3. 4 and 7 (they changed places)
    [1,2,4,7,5] -> [1,2,4,5,7]        4. 7 and 5 (they changed places)
    [1,2,4,7,5] -> [1,2,4,5,7]        5. checking for extra results
*/

fun ArrayList<Int>.bubbleSort(): ArrayList<Int> {
    val res = this
    for (i in res.indices) {
        for (j in 0 until res.size - i - 1) {
            if (res[j] > res[j + 1]) {
                val temp = res[j]
                res[j] = res[j + 1]
                res[j + 1] = temp
            }
        }
    }
    return res
}
