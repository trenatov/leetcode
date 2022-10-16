/**
 * https://leetcode.com/problems/move-zeroes
 */
class MoveZeroes : Problem {

    fun moveZeroes(nums: IntArray): Unit {
        var snowBallSize = 0
        for (i in nums.indices) {
            if (nums[i] == 0) {
                snowBallSize++
            } else if (snowBallSize > 0) {
                val t = nums[i]
                nums[i] = 0
                nums[i - snowBallSize] = t
            }
        }
    }

    private fun areOtherZeroes(nums: IntArray, index: Int): Boolean {
        for (i in index until nums.size) {
            if (nums[i] != 0) return false
        }

        return true
    }

    private fun sortElements(nums: IntArray) {
        for (i in nums.indices) {
            val current = nums[i]

            if (i + 1 == nums.size) return
            val next = nums[i + 1]
            if (next == 0 || next >= current) return

            swapElements(nums, i, i + 1)
        }
    }

    private fun swapElements(nums: IntArray, i1: Int, i2: Int) {
        val first = nums[i1]
        val second = nums[i2]

        nums[i1] = second
        nums[i2] = first
    }

    private fun moveToTheEnd(nums: IntArray, index: Int) {
        for (i in nums.indices.reversed()) {
            val current = nums[i]

            if (current != 0) {
                swapElements(nums, index, i)
                return
            }
        }
    }

    override fun run() {
        val array = intArrayOf(0, 1, 0, 3, 12)
        val array2 = intArrayOf(0)
        val array3 = intArrayOf(2, 1)
        moveZeroes(array)
        moveZeroes(array2)
        moveZeroes(array3)
        println(array.toList())
        println(array2.toList())
        println(array3.toList())
    }

}
