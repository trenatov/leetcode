package greedy

import Problem


/**
 * https://leetcode.com/problems/container-with-most-water/
 */
class ContainerWithMaxWater : Problem {

    fun maxArea(height: IntArray): Int {
        var maxVolume = 0

        var i = 0
        var j = height.size - 1

        while (i < j) {
            val volume = Math.min(height[i], height[j]) * (j - i)

            if (volume > maxVolume) {
                maxVolume = volume
            }

            if (height[i] < height[j]) {
                i++
            } else {
                j--
            }
        }

        return maxVolume
    }

    override fun run() {
        println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
        println(maxArea(intArrayOf(1, 1)))
        println(maxArea(intArrayOf(4, 3, 2, 1, 4)))
    }

}
