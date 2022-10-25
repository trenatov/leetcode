package binarysearch

import Problem

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 */
class GuessTheNumber : Problem {

    fun guessNumber(n: Int): Int {
        return search(1, n)
    }

    private fun search(left: Int, right: Int): Int {
        val mid = left + (right - left) / 2

        return when (guess(mid)) {
            0 -> {
                mid
            }

            1 -> {
                search(mid + 1, right)
            }

            else -> {
                search(left, mid - 1)
            }
        }
    }

    private fun guess(n: Int): Int {
        return if (n == 2) {
            0
        } else if (n < 2) {
            1
        } else {
            -1
        }
    }

    override fun run() {
        println(guessNumber(2))
    }

}
