/**
 * https://leetcode.com/problems/find-the-pivot-integer/
 */
class PivotInteger : Problem {

    fun pivotInteger(n: Int): Int {
        val nSum = arithmeticSum(n, 1)
        for (i in 1..n) {
            val iSum = arithmeticSum(i, 1)
            val diff = nSum - iSum + i
            if (iSum == diff) return i
        }

        return -1
    }

    private fun arithmeticSum(n: Int, a: Int): Int {
        return (((2 * a) + n - 1) * n) / 2
    }

    override fun run() {
        println(pivotInteger(8))
    }

}
