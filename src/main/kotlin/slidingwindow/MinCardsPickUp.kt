package slidingwindow

import Problem

/**
 * https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/
 */
class MinCardsPickUp : Problem {

    fun minimumCardPickup(cards: IntArray): Int {
        var min = Int.MAX_VALUE
        val map = mutableMapOf<Int, Int>()

        for (i in cards.indices) {
            val index = map[cards[i]]

            if (index == null) {
                map[cards[i]] = i
                continue
            } else {
                map[cards[i]] = i

                min = Math.min(min, i - index + 1)
            }
        }

        return if (min == Int.MAX_VALUE) -1 else min
    }

    override fun run() {

    }

}
