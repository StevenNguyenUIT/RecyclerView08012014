package com.nhinhnguyenuit.recyclerview08012014

import kotlin.math.pow
import kotlin.math.round

object TextUtils {
    fun formatDistance(distance: Int): String{
//        if (distance < 1000){
//            return "$distance m"
//        } else {
//            val div = distance / 1000
//            val roundedNumber = round((distance-(div*1000))/100.0)
//            val roundedNumber1 = roundedNumber/10.0
//            val result = div + roundedNumber1
//            if (roundedNumber1 == 0.0 || roundedNumber1 == 1.0){
//                return " ${result.toInt()} km"
//            }
//            return "$result km"
//        }

        // distance < 1000 => 999 m
        // distance == 1000 => 1km
        // distance > 1000 <===> 1110 / 1000 => 1.1km
        // distance > 1000 <===> 1150 / 1000 => 1.2km


        return if (distance < 1000) {
            "$distance m"
        } else {
            val result = (distance.toFloat() / 1000.toFloat())
            val digitZero = ((result * 100) % 100).toInt() == 0
            if (result % 1 != 0f && !digitZero) {
                val cifras = 10.0.pow(2.0)
                val finalResultString = String.format("%.1f", round(result * cifras) / cifras)
                val finalResultFloat = finalResultString.toFloat()
                if (finalResultFloat % 1.0f == 0f) {
                    "${finalResultFloat.toInt()} km"
                } else {
                    "$finalResultString km"
                }
            } else {
                "${result.toInt()} km"
            }
        }
    }
}