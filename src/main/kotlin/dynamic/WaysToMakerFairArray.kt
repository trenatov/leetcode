package dynamic

import Problem


/**
 * https://leetcode.com/problems/ways-to-make-a-fair-array/description/
 */
class WaysToMakerFairArray : Problem {

    fun waysToMakeFair(nums: IntArray): Int {
        var res = 0
        var prefixOdd = 0
        var prefixEven = 0
        var odd = 0
        var even = 0
        for (i in nums.indices) {
            if (i % 2 == 0) even += nums[i] else odd += nums[i]
        }
        for (i in nums.indices) {
            if (i % 2 == 0) {
                if (even - nums[i] - prefixEven + prefixOdd == odd + prefixEven - prefixOdd) res++
                prefixEven += nums[i]
            } else {
                if (odd - nums[i] - prefixOdd + prefixEven == even - prefixEven + prefixOdd) res++
                prefixOdd += nums[i]
            }
        }
        return res
    }

    override fun run() {
        println(waysToMakeFair(intArrayOf(2, 1, 6, 4)))
        println(waysToMakeFair(intArrayOf(1, 1, 1)))
        println(waysToMakeFair(intArrayOf(1, 2, 3)))
    }

}
