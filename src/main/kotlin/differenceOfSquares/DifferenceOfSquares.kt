package differenceOfSquares

import kotlin.math.pow

class Squares(private val n: Int) {

    private val numList = (1..n)

    fun sumOfSquares(): Int {
        return numList.map { it.toDouble().pow(2) }.sum().toInt()
    }

    fun squareOfSum(): Int {
        return numList.sum().toDouble().pow(2).toInt()
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}