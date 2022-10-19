/**
 * https://leetcode.com/problems/remove-element/
 */
class RemoveElement : Problem {

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var nextPosition = 0

        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[nextPosition] = nums[i]
                nextPosition++
            }
        }
        return nextPosition
    }

    override fun run() {
    }

}
