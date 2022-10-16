/**
 * https://leetcode.com/problems/permutations/
 */
class Permutation : Problem {

    fun permute(nums: IntArray): List<List<Int>> {
        val list: MutableList<List<Int>> = ArrayList()
        backtrack(list, ArrayList(), nums)
        return list
    }

    private fun backtrack(list: MutableList<List<Int>>, tempList: MutableList<Int>, nums: IntArray) {
        if (tempList.size == nums.size) {
            list.add(ArrayList(tempList))
        } else {
            for (i in nums.indices) {
                if (tempList.contains(nums[i])) continue
                tempList.add(nums[i])
                backtrack(list, tempList, nums)
                tempList.removeAt(tempList.size - 1)
            }
        }
    }

    override fun run() {
        println(permute(intArrayOf(1, 2, 3)).toList())
    }

}
