/**
 * https://leetcode.com/problems/single-number/
 */
class SingleNumber : Problem {

    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (i in nums) {
            result = result xor i
        }
        return result
    }

    override fun run() {
    }

}
