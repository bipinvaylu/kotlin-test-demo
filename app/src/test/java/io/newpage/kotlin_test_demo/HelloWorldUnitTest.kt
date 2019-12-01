package io.newpage.kotlin_test_demo

import org.junit.Test
import org.junit.Assert.*

/**
 * Created by Bipin Vayalu on 2019-11-27.
 */

class HelloWorldUnitTest {

    @Test
    fun helloWorldReturnsPersonalizedMessage() {
        assertEquals("Hello, GDG!", helloWorld("GDG"))
    }
}
