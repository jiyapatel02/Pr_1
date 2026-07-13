class Matrix(private val data: Array<IntArray>) {

    operator fun plus(other: Matrix): Matrix {
        val result = Array(data.size) { IntArray(data[0].size) }

        for (i in data.indices)
            for (j in data[0].indices)
                result[i][j] = data[i][j] + other.data[i][j]

        return Matrix(result)
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Array(data.size) { IntArray(data[0].size) }

        for (i in data.indices)
            for (j in data[0].indices)
                result[i][j] = data[i][j] - other.data[i][j]

        return Matrix(result)
    }

    operator fun times(other: Matrix): Matrix {
        val result = Array(data.size) { IntArray(other.data[0].size) }

        for (i in data.indices)
            for (j in other.data[0].indices)
                for (k in data[0].indices)
                    result[i][j] += data[i][k] * other.data[k][j]

        return Matrix(result)
    }

    override fun toString(): String {
        return data.joinToString("\n") { row ->
            row.joinToString(" ")
        }
    }
}

fun main() {
    val m1 = Matrix(arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4)
    ))

    val m2 = Matrix(arrayOf(
        intArrayOf(5, 6),
        intArrayOf(7, 8)
    ))

    println("Matrix 1:")
    println(m1)

    println("\nMatrix 2:")
    println(m2)

    println("\nAddition:")
    println(m1 + m2)

    println("\nSubtraction:")
    println(m1 - m2)

    println("\nMultiplication:")
    println(m1 * m2)
}