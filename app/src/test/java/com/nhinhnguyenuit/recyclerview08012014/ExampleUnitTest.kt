package com.nhinhnguyenuit.recyclerview08012014

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun formatDistance() {
        var distance1 = 1001
        var distance2 = 1190
        var distance3 = 1900
        var distance4 = 999
        var distance5 = 9

        assertEquals("1 km",TextUtils.formatDistance(distance1))
        assertEquals("1.2 km",TextUtils.formatDistance(distance2))
        assertEquals("1.9 km",TextUtils.formatDistance(distance3))
        assertEquals("999 m",TextUtils.formatDistance(distance4))
        assertEquals("9 m",TextUtils.formatDistance(distance5))

    }
}