/**
 * https://leetcode.com/problems/running-sum-of-1d-array/submissions/
 */
class RunningSum : Problem {

    fun runningSum(nums: IntArray): IntArray {
        val new = IntArray(nums.size)

        new[0] = nums[0]

        for (i in nums.indices.reversed()) {
            if (i == 0) break

            var c = i
            var sum = 0
            while (c >= 0) {
                sum += nums[c]
                c--
            }

            new[i] = sum
        }

        return new
    }

    override fun run() {
        val nums = intArrayOf(1, 2, 3, 4)
        val nums2 = intArrayOf(1,1,1,1,1)
        val nums3 = intArrayOf(3,1,2,10,1)

        println(runningSum(nums).toList())
        println(runningSum(nums2).toList())
        println(runningSum(nums3).toList())
    }

}
