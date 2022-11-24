package math

import Problem

/**
 * https://leetcode.com/problems/find-greatest-common-divisor-of-array/
 */
class GreatestCommonDivisorInArray : Problem {

    fun findGCD(nums: IntArray): Int {
        nums.sort()
        val smallest = nums[0]
        val greatest = nums[nums.size - 1]
        var gcd = 1

        for (i in 2..greatest) {
            if (smallest % i == 0 && greatest % i == 0 && i > gcd) {
                gcd = i
            }
        }
        return gcd
    }

    override fun run() {

    }

}
