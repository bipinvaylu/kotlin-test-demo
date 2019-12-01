package io.newpage.kotlin_test_demo

/**
 * Created by Bipin Vayalu on 2019-11-28.
 */

class FirebaseCalculator constructor(private val service: FirebaseCaculatorService) {

    // Let's say our FirebaseService is doing multiplication on server
    fun doXCaculation(a: Int, b: Int): Int {
        return service.performCalculation(a,b)
//        return a*b
    }


}
