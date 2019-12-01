package io.newpage.kotlin_test_demo

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when` as _when

/**
 * Created by Bipin Vayalu on 2019-11-28.
 */

class FirebaseCalcuatorTest {

    val service: FirebaseCaculatorService =
        Mockito.mock(FirebaseCaculatorService::class.java)

    val firebaseCalculator: FirebaseCalculator = FirebaseCalculator(service)

    @Test
    fun `Test X Calculation success scenario`() {
        _when(service.performCalculation(5, 4)).thenReturn(20)
        assertEquals(20, firebaseCalculator.doXCaculation(5, 4))
        verify(service).performCalculation(5,4)
    }


    @Test
    fun `Test X Calculation failure scenario`() {
        _when(service.performCalculation(7, 2)).thenReturn(14)
        assertNotEquals(15, firebaseCalculator.doXCaculation(7, 2))
    }

}
