package pangram

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PangramTest {

    @Test
    fun `empty sentence`() {
        assertFalse(Pangram.isPangram(""))
    }

    @Test
    fun `perfect lower case`() {
        assertTrue(Pangram.isPangram("abcdefghijklmnopqrstuvwxyz"))
    }

    @Test
    fun `only lower case`() {
        assertTrue(Pangram.isPangram("the quick brown fox jumps over the lazy dog"))
    }

    @Test
    fun `missing the letter x`() {
        assertFalse(Pangram.isPangram("a quick movement of the enemy will jeopardize five gunboats"))
    }

    @Test
    fun `missing the letter h`() {
        assertFalse(Pangram.isPangram("five boxing wizards jump quickly at it"))
    }

    @Test
    fun `with under scores`() {
        assertTrue(Pangram.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"))
    }

    @Test
    fun `with numbers`() {
        assertTrue(Pangram.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"))
    }

    @Test
    fun `missing letters replaced by numbers`() {
        assertFalse(Pangram.isPangram("7h3 quick brown fox jumps ov3r 7h3 2 lazy dog"))
    }

    @Test
    fun `mixed case and punctuation`() {
        assertTrue(Pangram.isPangram("\"Five quacking Zephyrs jolt my wzx bed.\""))
    }

    @Test
    fun `case insensitive`() {
        assertFalse(Pangram.isPangram("the quick brown fox jumps over with lazy FX"))
    }
}