package array

import Problem


/**
 * https://leetcode.com/problems/sort-array-by-parity/
 */
class SortArrayByParity : Problem {

    fun sortArrayByParity(nums: IntArray): IntArray {
        var index = 0

        for (i in nums.indices) {

            if (nums[i] % 2 == 0) {
                val temp = nums[index]
                nums[index] = nums[i]
                nums[i] = temp
                index++
            }

        }

        return nums
    }

    override fun run() {
        println(sortArrayByParity(intArrayOf(3, 1, 2, 4)).toList())
        println(sortArrayByParity(intArrayOf(0)).toList())
        println(sortArrayByParity(intArrayOf(2, 4, 1, 3)).toList())
        println(sortArrayByParity(intArrayOf(2, 3, 4, 3)).toList())
    }

}
