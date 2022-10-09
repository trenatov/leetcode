/**
 * https://leetcode.com/problems/two-sum/
 */
class TwoSum : Problem {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (index in nums.indices) {
            for (i in index + 1 until nums.size) {
                val first = nums[index]
                val second = nums[i]

                if (first + second == target) {
                    return intArrayOf(index, i)
                }
            }
        }
        return intArrayOf()
    }

    override fun run() {
        println(twoSum(intArrayOf(2, 7, 11, 15), 9).asList())
        println(twoSum(intArrayOf(3, 2, 4), 6).asList())
        println(twoSum(intArrayOf(3, 3), 6).asList())
    }

}
