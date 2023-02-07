package array

import Problem


/**
 * https://leetcode.com/problems/fruit-into-baskets/
 */
class FruitIntoBascets : Problem {

    fun totalFruit(fruits: IntArray): Int {
        if (fruits.size <= 1) return 1

        var max = 0

        for (i in 0 until fruits.lastIndex) {
            val count = countFirstTwoUniqueInts(fruits, i)

            if (count > max) {
                max = count
            }
        }

        return max
    }

    private fun countFirstTwoUniqueInts(array: IntArray, from: Int): Int {
        val map = mutableMapOf<Int, Int>()

        for (i in from..array.lastIndex) {
            val element = array[i]

            if (map[element] == null && map.size >= 2) {
                return map.map { it.value }.sum()
            } else if (map[element] == null) {
                map[element] = 1
            } else if (map[element] != null) {
                map[element] = map[element]!! + 1
            }
        }
        return map.map { it.value }.sum()
    }

    override fun run() {
        println(totalFruit(intArrayOf(1, 2, 1)))
        println(totalFruit(intArrayOf(0, 1, 2, 2)))
        println(totalFruit(intArrayOf(1, 2, 3, 2, 2)))
    }

}
