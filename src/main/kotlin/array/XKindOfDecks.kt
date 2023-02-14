package array

import Problem


/**
 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/description/
 */
class XKindOfDecks : Problem {

    fun hasGroupsSizeX(deck: IntArray): Boolean {
        val count = IntArray(10000)
        for (c in deck) count[c]++
        var g = -1
        for (i in 0..9999) if (count[i] > 0) {
            g = if (g == -1) count[i] else gcd(g, count[i])
        }
        return g >= 2
    }

    fun gcd(x: Int, y: Int): Int {
        return if (x == 0) y else gcd(y % x, x)
    }

    override fun run() {
        intArrayOf(2, 4, 6, 3, 1)
    }

}
