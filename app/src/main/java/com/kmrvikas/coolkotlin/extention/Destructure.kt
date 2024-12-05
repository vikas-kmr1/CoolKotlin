package com.kmrvikas.coolkotlin.extention

import java.time.LocalDate
import kotlin.math.pow

class Extention() {
    fun destructure() {
        operator fun LocalDate.component1() = year
        operator fun LocalDate.component2() = monthValue
        operator fun LocalDate.component3() = dayOfMonth

        val today: LocalDate = LocalDate.parse("2024-10-28")
        val (year, month, day) = today
        println("$year-$month-$day")
    }

    fun callAnyObject() {
        operator fun Any?.invoke() {
            println(this)
        }
        "Extension"()
        123()
        null()
        listOf("1","2")

    }

    fun indexingAnything(){
        operator fun Int.get(index:Int):Int = div(10.0.pow(index)).rem(10.0).toInt()
        println(123[1])
        println(987654321[0])
        println(987654321[8])
        println(987654321[11])
    }

}



fun main() {

    Extention().apply {
        destructure()
        callAnyObject()
        indexingAnything()
    }
}