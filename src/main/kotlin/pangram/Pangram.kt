package pangram

object Pangram {

    private val alphabet = ('a' .. 'z').toList()

    fun isPangram(input: String): Boolean {
        return input.map { it.lowercaseChar() }.containsAll(alphabet)
    }
}