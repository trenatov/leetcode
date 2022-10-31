/**
 * https://leetcode.com/problems/toeplitz-matrix/
 */
class ToeplitzMatrix : Problem {

    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {

        for (j in matrix.indices) {
            for (i in 0 until matrix[j].lastIndex) {
                var current = i + 1

                for (c in j + 1 until matrix.size) {
                    if (current > matrix[c].lastIndex) {
                        continue
                    }

                    if (matrix[j][i] != matrix[c][current]) {
                        return false
                    }
                    current++
                }
            }
        }
        return true
    }

    override fun run() {
        val row1 = intArrayOf(36, 59, 71, 15, 26, 82, 87)
        val row2 = intArrayOf(56, 36, 59, 71, 15, 26, 82)
        val row3 = intArrayOf(15, 0, 36, 59, 71, 15, 26)

        val row4 = intArrayOf(1, 2, 3, 4)
        val row5 = intArrayOf(5, 1, 2, 3)
        val row6 = intArrayOf(9, 5, 1, 2)

        //println(isToeplitzMatrix(arrayOf(row1, row2, row3)))
        //println(isToeplitzMatrix(arrayOf(row4, row5, row6)))
        //println(isToeplitzMatrix(arrayOf(intArrayOf(18), intArrayOf(66))))
        println(isToeplitzMatrix(arrayOf(intArrayOf(11, 74, 0, 93), intArrayOf(40, 11, 74, 7))))
    }


}
