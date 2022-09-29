package pangram

import org.junit.jupiter.api.Test
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
}