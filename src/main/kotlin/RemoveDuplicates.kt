/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
class RemoveDuplicates : Problem {

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var lastIdx = 1
        var curVal = nums[0]

        nums.forEachIndexed { i, _ ->
            if (nums[i] > curVal) {
                curVal = nums[i]
                nums[lastIdx] = nums[i]
                lastIdx++
            }
        }

        return lastIdx
    }

    override fun run() {

    }

}
