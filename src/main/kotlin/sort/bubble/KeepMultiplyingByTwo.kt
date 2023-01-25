package sort.bubble

import Problem


/**
 * https://leetcode.com/problems/keep-multiplying-found-values-by-two/
 */
class KeepMultiplyingByTwo : Problem {

    fun findFinalValue(nums: IntArray, original: Int): Int {
        do {
            var swapped = false
            for (i in 0 until nums.size - 1) {
                if (nums[i] > nums[i + 1]) {
                    val temp = nums[i]
                    nums[i] = nums[i + 1]
                    nums[i + 1] = temp
                    swapped = true
                }
            }
        } while (swapped)

        var result = original
        for (n in nums) {

            if (result == n) {
                result *= 2
            }
        }

        return result
    }

    override fun run() {
        println(findFinalValue(intArrayOf(5, 3, 6, 1, 12), 3))
        println(findFinalValue(intArrayOf(2, 7, 9), 4))
    }

}
