package gigasecond

import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(localDateTime: LocalDateTime) {
    val gigasecond: Long = 1000000000

    constructor(localDate: LocalDate): this(localDate.atStartOfDay())

    val date: LocalDateTime = localDateTime.plusSeconds(gigasecond)
}