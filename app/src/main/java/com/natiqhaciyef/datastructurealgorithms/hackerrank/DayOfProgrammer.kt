package com.natiqhaciyef.datastructurealgorithms.hackerrank

import java.time.LocalDateTime
import java.time.Month

fun dayOfProgrammer(year: Int): String {
    return if (year > 1918) {
        val calendar1 = LocalDateTime.of(year, Month.SEPTEMBER, 12, 0, 0)
        val calendar2 = LocalDateTime.of(year, Month.SEPTEMBER, 13, 0, 0)
        if (calendar1.dayOfYear == 256)
            "${calendar1.dayOfMonth}.09.${calendar1.year}"
        else if (calendar2.dayOfYear == 256)
            "${calendar2.dayOfMonth}.09.${calendar2.year}"
        else
            "Error"
    }else if (year == 1918)
        "26.09.1918"
    else
        if (year % 4 != 0) "13.09.$year" else "12.09.$year"

}
