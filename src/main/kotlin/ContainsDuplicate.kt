/**
 * https://leetcode.com/problems/contains-duplicate/
 */
class ContainsDuplicate : Problem {

    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.size != nums.distinct().size
    }

    override fun run() {
    }

}
