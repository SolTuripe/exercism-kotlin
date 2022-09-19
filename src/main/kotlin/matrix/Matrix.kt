package matrix

class Matrix(private val matrixAsString: String) {
    private val data = matrixAsString.lines()
        .map { it.trim().replace("\\s+".toRegex(), " ")
            .split(" ")
            .map(String::toInt)
        }

    fun colum(colNr: Int): List<Int> {
        return data.map {it[colNr-1]}
    }

    fun row(rowNr: Int): List<Int> {
        return data[rowNr-1]
    }
}