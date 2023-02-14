package string

import Problem


/**
 * https://leetcode.com/problems/maximum-number-of-balloons/description/
 */
class MaxNumberOfBalloons : Problem {

    fun maxNumberOfBalloons(text: String): Int {
        val map = mutableMapOf('b' to 0, 'a' to 0, 'l' to 0, 'o' to 0, 'n' to 0)
        text.forEach {
            when (it) {
                'b', 'a', 'l', 'o', 'n' -> map[it] = map.getOrDefault(it, 0) + 1
            }
        }
        var counter = 0
        while (map.values.all { it > 0 }) {
            map.forEach {
                when (it.key) {
                    'b', 'a', 'n' -> if (it.value > 0) map[it.key] = map[it.key]!! - 1 else return counter
                    'l', 'o' -> if (it.value > 1) map[it.key] = map[it.key]!! - 2 else return counter
                }
            }
            counter++
        }

        return counter
    }

    override fun run() {
    }

}
