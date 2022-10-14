/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
class FirstAndLastPosition : Problem {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty()) return intArrayOf(-1, -1)
        if (nums.size == 1 && nums.first() == target) return intArrayOf(0, 0)
        if (nums.size == 1 && nums.first() != target) return intArrayOf(-1, -1)

        return findIndexes(nums, target, 0, nums.size - 1)
    }

    private fun findIndexes(array: IntArray, target: Int, l: Int, r: Int): IntArray {
        if (array.size > 2 && r - l <= 1) return intArrayOf(-1, -1)

        val mid = (l + r) / 2
        val midValue = array[mid]

        return if (midValue == target) {
            if (mid - 1 >= l && array[mid - 1] == target) {
                return intArrayOf(mid - 1, mid)
            } else if (mid + 1 <= r && array[mid + 1] == target) {
                return intArrayOf(mid, mid + 1)
            } else if (mid - 1 >= l && array[mid - 1] != target) {
                return intArrayOf(mid, mid)
            } else if (mid + 1 <= r && array[mid + 1] != target) {
                return intArrayOf(mid, mid)
            }

            intArrayOf(-1, -1)
        } else if (midValue < target) {
            if (array.size <= 2) {
                return intArrayOf(-1, -1)
            }
            findIndexes(array, target, mid, r)
        } else {
            if (array.size <= 2) {
                return intArrayOf(-1, -1)
            }
            findIndexes(array, target, l, mid)
        }
    }

    override fun run() {
//        println(searchRange(intArrayOf(5, 5, 7, 7, 8, 8, 10), 5).toList())
//        println(searchRange(intArrayOf(5, 7, 7, 8, 8, 10, 10), 10).toList())
//        println(searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6).toList())
//        println(searchRange(intArrayOf(), 0).toList())
        // println(searchRange(intArrayOf(1), 1).toList())
        // println(searchRange(intArrayOf(2, 2), 2).toList())
        // println(searchRange(intArrayOf(2, 2), 1).toList())
        //  println(searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6).toList())
        println(searchRange(intArrayOf(1, 3), 1).toList())
    }

}
