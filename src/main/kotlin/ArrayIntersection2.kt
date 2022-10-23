import java.util.*


/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii
 */
class ArrayIntersection2 : Problem {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        Arrays.sort(nums1)
        Arrays.sort(nums2)
        var top = 0
        var bottom = 0
        val h: MutableList<Int> = ArrayList()

        while (true) {
            if (top >= nums1.size || bottom >= nums2.size) {
                break
            }
            if (nums1[top] == nums2[bottom]) {
                h.add(nums1[top])
                top++
                bottom++
            } else if (nums1[top] < nums2[bottom]) {
                top++
            } else if (nums1[top] > nums2[bottom]) {
                bottom++
            }
        }

        val g = IntArray(h.size)
        for (i in h.indices) {
            g[i] = h[i]
        }
        return g
    }

    override fun run() {
    }

}
