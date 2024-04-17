package com.nhinhnguyenuit.recyclerview08012014

import kotlin.math.round

object TextUtils {
    fun formatDistance(distance: Int): String{
        if (distance < 1000){
            return "$distance m"
        } else {
            val div = distance / 1000
            val roundedNumber = (distance-(div*1000))/100.0
            val roundedNumber1 = round(roundedNumber)
            val roundedNumber2 = roundedNumber1/10.0
            val result = div + roundedNumber2
            if (roundedNumber2 == 0.0){
                return "${result.toInt()} km"
            }
            return "$result km"
        }
    }
}