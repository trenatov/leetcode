/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
class ArrayIntersection : Problem {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val answer = mutableSetOf<Int>()

        for (v in nums1) {
            if (nums2.contains(v)) {
                answer.add(v)
            }
        }

        return answer.toIntArray()
    }

    override fun run() {
    }

}
