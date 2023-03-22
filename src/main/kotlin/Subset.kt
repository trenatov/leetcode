/**
 * https://leetcode.com/problems/subsets/description/
 */
class Subset : Problem {

    fun subsets(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()
        backtrack(ans, mutableListOf(), nums, 0)
        return ans
    }

    private fun backtrack(ans: MutableList<MutableList<Int>>, current: MutableList<Int>, nums: IntArray, index: Int) {
        ans.add(current.toMutableList())

        for (i in index..nums.lastIndex) {
            current.add(nums[i])
            backtrack(ans, current, nums, i + 1)
            current.removeAt(current.lastIndex)
        }
    }

    override fun run() {
        println(subsets(intArrayOf(1, 2, 3)))
    }

}
