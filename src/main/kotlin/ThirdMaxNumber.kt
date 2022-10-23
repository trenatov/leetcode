/**
 * https://leetcode.com/problems/isomorphic-strings/
 */
class ThirdMaxNumber : Problem {

    fun thirdMax(nums: IntArray): Int {
        val set = nums.toHashSet()

        val list = set.toList().sorted()

        return if (list.size < 3) {
            list[list.size - 1]
        } else list[list.size - 3]
    }

    override fun run() {
    }

}
