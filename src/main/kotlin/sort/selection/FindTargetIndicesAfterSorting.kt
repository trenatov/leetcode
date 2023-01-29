package sort.selection

import Problem

/**
 * https://leetcode.com/problems/find-target-indices-after-sorting-array/
 */
class FindTargetIndicesAfterSorting : Problem {

    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        val list = mutableListOf<Int>()
        sort(nums)

        for (index in nums.indices) {
            if (nums[index] == target) list.add(index)
        }
        return list
    }

    private fun sort(nums: IntArray) {
        for (i in nums.indices) {
            var smallest = i
            for (j in i + 1..nums.lastIndex) {
                if (nums[smallest] > nums[j]) smallest = j
            }

            val temp = nums[smallest]
            nums[smallest] = nums[i]
            nums[i] = temp
        }
    }

    override fun run() {
        println(targetIndices(intArrayOf(1, 2, 5, 2, 3), 2))
        println(targetIndices(intArrayOf(1, 2, 5, 2, 3), 3))
    }

}
