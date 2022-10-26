package handshakeCalculator

import org.junit.Test
import kotlin.test.assertEquals

class HandshakeCalculatorTest {

    @Test
    fun `test that Input 1 yields a wink`() {
        assertEquals(
            listOf(Signal.WINK),
            HandshakeCalculator.calculateHandshake(1)
        )
    }

    @Test
    fun `test that Input 2 yields a double blink`() {
        assertEquals(
            listOf(Signal.DOUBLE_BLINK),
            HandshakeCalculator.calculateHandshake(2)
        )
    }

    @Test
    fun `test that Input 4 yields a close your eyes`() {
        assertEquals(
            listOf(Signal.CLOSE_YOUR_EYES),
            HandshakeCalculator.calculateHandshake(4)
        )
    }

    @Test
    fun `test that Input 8 yields a jump`() {
        assertEquals(
            listOf(Signal.JUMP),
            HandshakeCalculator.calculateHandshake(8)
        )
    }

    @Test
    fun `test that Input 3 yields a two actions`() {
        assertEquals(
            listOf(Signal.WINK, Signal.DOUBLE_BLINK),
            HandshakeCalculator.calculateHandshake(3)
        )
    }

    @Test
    fun `test that Input 19 yields a two reverse actions`() {
        assertEquals(
            listOf(Signal.DOUBLE_BLINK, Signal.WINK),
            HandshakeCalculator.calculateHandshake(19)
        )
    }

    @Test
    fun `test reversing a single action yields the same action`() {
        assertEquals(
            listOf(Signal.JUMP),
            HandshakeCalculator.calculateHandshake(24)
        )
    }

    @Test
    fun `test reversing no actions yields no actions`() {
        assertEquals(
            emptyList(),
            HandshakeCalculator.calculateHandshake(16)
        )
    }

    @Test
    fun `test Input that yields all actions`() {
        assertEquals(
            listOf(Signal.JUMP, Signal.CLOSE_YOUR_EYES, Signal.DOUBLE_BLINK, Signal.WINK),
            HandshakeCalculator.calculateHandshake(31)
        )
    }

    @Test
    fun `test that Input yields no actions`() {
        assertEquals(
            emptyList(),
            HandshakeCalculator.calculateHandshake(0)
        )
    }

    @Test
    fun `test that Input with lower 5 bits not set yields no actions`() {
        assertEquals(
            emptyList(),
            HandshakeCalculator.calculateHandshake(32)
        )
    }
}