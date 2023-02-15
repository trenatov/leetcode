package greedy

import Problem


/**
 * https://leetcode.com/problems/maximum-ice-cream-bars/
 */
class MaxIceCreamBars : Problem {

    fun maxIceCream(costs: IntArray, coins: Int): Int {
        var count = 0
        costs.sort()
        var left = coins
        for (c in costs) {
            if (left < c) return count
            left -= c
            count++
        }

        return count
    }

    override fun run() {

    }

}
