/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */
class NRepeatedElementInAnArray : Problem {

    fun repeatedNTimes(nums: IntArray): Int {
        val n = (nums.size - 1) / 2 + 1

        for (i in nums.indices) {
            var count = 1
            for (j in i + 1..nums.lastIndex) {
                if (nums[i] == nums[j]) {
                    count++
                }
            }

            if (count == n) return nums[i]
        }

        return -1
    }

    override fun run() {
        println(repeatedNTimes(intArrayOf(1, 2, 3, 3)))
        println(repeatedNTimes(intArrayOf(2, 1, 2, 5, 3, 2)))
    }

}
