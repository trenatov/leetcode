
/**
 * https://leetcode.com/problems/squares-of-a-sorted-array
 */
class SquareOfSortedArray : Problem {

    fun sortedSquares(nums: IntArray): IntArray {
        val n: Int = nums.size
        val array = IntArray(n)
        var i = 0
        var j = n - 1

        for (p in n - 1 downTo 0) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                array[p] = nums[i] * nums[i]
                i++
            } else {
                array[p] = nums[j] * nums[j]
                j--
            }
        }
        return array
    }

    override fun run() {
        val array = intArrayOf(-4, -1, 0, 3, 10)
        println(sortedSquares(array).toList())
    }

}
