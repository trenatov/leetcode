/**
 * https://leetcode.com/problems/search-insert-position
 */
class SearchInsertPosition : Problem {

    fun searchInsert(nums: IntArray, target: Int): Int {
        return searchIndex(nums, target, 0, nums.size - 1)
    }

    private fun searchIndex(nums: IntArray, target: Int, l: Int, r: Int): Int {
        val midIndex = (r + l) / 2
        val midValue = nums[midIndex]

        if (r - l <= 1) {
            return if (nums[l] < target && nums[r] > target) {
                l + 1
            } else if (nums[r] < target) {
                r + 1
            } else if (nums[l] > target && l == 0) {
                0
            } else if (midValue == target) {
                midIndex
            } else if (nums[r] == target) {
                r
            } else if (nums[l] == target) {
                l
            } else {
                -111
            }
        }

        return if (target == midValue) {
            midIndex
        } else if (midValue > target) {
            searchIndex(nums, target, l, midIndex)
        } else {
            searchIndex(nums, target, midIndex, r)
        }
    }

    override fun run() {
//        println(searchInsert(intArrayOf(1, 3, 5, 6), 5))
//        println(searchInsert(intArrayOf(1, 3, 5, 6), 2))
//        println(searchInsert(intArrayOf(1, 3, 5, 6), 7))
//        println(searchInsert(intArrayOf(1, 3, 5, 6), 0))
        //println(searchInsert(intArrayOf(1), 0))
        //println(searchInsert(intArrayOf(1), 1))
        println(searchInsert(intArrayOf(1, 3), 3))
    }

}
