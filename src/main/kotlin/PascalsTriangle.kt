/**
 * https://leetcode.com/problems/pascals-triangle/
 */
class PascalsTriangle : Problem {

    fun generate(numRows: Int): List<List<Int>> {
        val all = mutableListOf<List<Int>>()
        var prevRow = mutableListOf<Int>()
        for (i in 1..numRows) {

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
            all.add(row)
        }

        return all
    }

    override fun run() {
        println(generate(5))
    }

}
