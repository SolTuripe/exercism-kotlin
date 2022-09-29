package pangram

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class PangramTest {

    @Test
    fun `empty sentence`() {
        assertFalse(Pangram.isPangram(""))
    }
}