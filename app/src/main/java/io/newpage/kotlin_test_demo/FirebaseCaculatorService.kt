package io.newpage.kotlin_test_demo

/**
 * Created by Bipin Vayalu on 2019-11-28.
 */

// Assume: This is some class which is developed and tested
// by firebase server to do some heavy calculation.
public interface FirebaseCaculatorService {

    fun performCalculation(a: Int, b: Int): Int

}
