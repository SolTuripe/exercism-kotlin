package gigasecond

import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import kotlin.test.assertEquals

class GigasecondTest {

    @Test
    fun `date only specification of time`() {
        val gigaSecond = Gigasecond(LocalDate.of(2011, Month.APRIL, 25))

        assertEquals(LocalDateTime.of(2043, Month.JANUARY, 1, 1, 46, 40), gigaSecond.date)
    }

}