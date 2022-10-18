package hamming

import org.junit.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException
import kotlin.test.assertEquals

class HammingTest {
    private val hamming = Hamming()

    @Test
    fun `empty strands`() {
        assertEquals(0, hamming.compute("", ""))
    }

    @Test
    fun `single letter identical strands`() {
        assertEquals(0, hamming.compute("A", "A"))
    }

    @Test
    fun `single letter different strands`() {
        assertEquals(1, hamming.compute("G", "T"))
    }

    @Test
    fun `long identical strands`() {
        assertEquals(0, hamming.compute("GGACTGAAATCTG", "GGACTGAAATCTG"))
    }

    @Test
    fun `long different strands`() {
        assertEquals(9, hamming.compute("GGACGGATTCTG", "AGGACGGATTCT"))
    }

    @Test
    fun `disallow first strand longer`() {
        val exception = assertThrows<IllegalArgumentException> {
            hamming.compute("AATG", "AAA")
        }
        assertEquals("left and right strands must be of equal length", exception.message)
    }

    @Test
    fun `disallow second strand longer`() {
        val exception = assertThrows<IllegalArgumentException> {
            hamming.compute("ATA", "AGTG")
        }
        assertEquals("left and right strands must be of equal length", exception.message)
    }
}

