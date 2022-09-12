package helloWordl

import helloWorld.HelloWorld
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HelloWorldTest {

    @Test
    fun helloWorldTest() {
        var helloWorld = HelloWorld()
        assertEquals("Hello, World!", helloWorld.hello())
    }

}