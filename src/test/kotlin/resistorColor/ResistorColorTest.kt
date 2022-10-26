package resistorColor

import org.junit.Test
import kotlin.test.assertEquals

class ResistorColorTest {

    @Test
    fun `test black color code`() {
        assertEquals(0, ResistorColor.colorCode("black"))
    }

    @Test
    fun `test white color code`() {
        assertEquals(9, ResistorColor.colorCode("white"))
    }

    @Test
    fun `test orange color code`() {
        assertEquals(3, ResistorColor.colorCode("orange"))
    }

    @Test
    fun `test colors`() {
        val expected = listOf("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
        assertEquals(expected, ResistorColor.colors())
    }
}