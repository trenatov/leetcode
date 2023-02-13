/**
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 */
class CountOddNumbersInInterval : Problem {

    fun countOdds(low: Int, high: Int): Int {
        var count = 0

        for (n in low..high) {
            if (n % 2 != 0) count++
        }

        return count
    }

    override fun run() {
    }

}
