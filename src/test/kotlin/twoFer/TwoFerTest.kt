package twoFer

import org.junit.Test
import kotlin.test.assertEquals

class TwoFerTest {

  private val twoFER = TwoFer()

    @Test
    fun `no name given`() {
        assertEquals("One for you, one for me.", twoFER.twoFer())
    }

    @Test
    fun `a name given`() {
        assertEquals("One for Alice, one for me.", twoFER.twoFer("Alice"))
    }

    @Test
    fun `another name given`() {
        assertEquals("One for Bob, one for me.", twoFER.twoFer("Bob"))
    }

    @Test
    fun `empty string given`() {
        assertEquals("One for , one for me.", twoFER.twoFer(""))
    }
}