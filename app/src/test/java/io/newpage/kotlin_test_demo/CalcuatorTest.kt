package io.newpage.kotlin_test_demo

import org.junit.Test
import  org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before

/**
 * Created by Bipin Vayalu on 2019-11-28.
 */

class CalcuatorTest  {


    var calculator:Calculator? = null

    @Before
    fun runFirst() {
        calculator = Calculator()
    }

    @Test
    fun `Test add method success`() {
        assertEquals(10, calculator?.add(7, 3))
    }

    @Test
    fun `Test add method failure`() {
        assertNotEquals(10, calculator?.add(2,3))
    }
}
