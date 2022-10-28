/**
 * https://leetcode.com/problems/majority-element-ii/
 */
class MajorityElementTwo : Problem {

    fun majorityElement(nums: IntArray): List<Int> {
        val ans: MutableList<Int> = ArrayList()

        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums) {
            map[i] = map.getOrDefault(i, 0) + 1
        }

        for (i in map.keys) {
            if (map[i]!! > nums.size / 3) {
                ans.add(i)
            }
        }
        return ans
    }

    override fun run() {
    }

}
