package hamming

import java.lang.IllegalArgumentException

class Hamming {
    fun compute(leftStrand: String, rightStrand: String): Any {
        if(leftStrand.length != rightStrand.length)
            throw IllegalArgumentException("left and right strands must be of equal length")

        var counter: Int = 0
        for (i in leftStrand.indices) {
            if(leftStrand[i] !== rightStrand[i]) counter++
        }
        return counter
    }
}