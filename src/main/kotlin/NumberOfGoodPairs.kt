/**
 * https://leetcode.com/problems/number-of-good-pairs/
 */
class NumberOfGoodPairs : Problem {

    fun numIdenticalPairs(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j]) {
                    count++
                }
            }
        }
        return count
    }

    override fun run() {
        println(numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3)))
        println(numIdenticalPairs(intArrayOf(1, 1, 1, 1)))
    }

}
