/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 */
class PascalsTriangleTwo : Problem {

    fun getRow(rowIndex: Int): List<Int> {
        var prevRow = mutableListOf<Int>()
        for (i in 1..rowIndex + 1) {

            val row = mutableListOf<Int>()

            for (j in 0 until i) {
                if (j == 0 || j == i - 1) {
                    row.add(1)
                } else {
                    val prevValue = prevRow[j - 1]
                    val nextValue = prevRow[j]

                    row.add(prevValue + nextValue)
                }
            }
            prevRow = row
        }

        return prevRow
    }

    override fun run() {
        println(getRow(1))
    }

}
