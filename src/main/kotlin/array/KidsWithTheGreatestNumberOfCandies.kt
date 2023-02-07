package array

import Problem


/**
 *  https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
class KidsWithTheGreatestNumberOfCandies : Problem {

    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = findGreatest(candies)

        return candies.map { it + extraCandies }.map {
            it >= max
        }
    }

    private fun findGreatest(array: IntArray): Int {
        var max = 0
        for (i in array) {
            if (i > max) {
                max = i
            }
        }
        return max
    }

    override fun run() {
    }

}
