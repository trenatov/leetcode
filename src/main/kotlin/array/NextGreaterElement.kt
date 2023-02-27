package array

import Problem
import java.util.*


/**
 * https://leetcode.com/problems/next-greater-element-i/
 */
class NextGreaterElement : Problem {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val map = mutableMapOf<Int, Int>()
        val ans = IntArray(nums1.size)
        val stack = Stack<Int>()

        for (i in nums2.lastIndex downTo 0) {
            val v = nums2[i]
            map[v] = getNextGreaterElement(stack, v)
        }

        for (i in nums1.indices) {
            ans[i] = map[nums1[i]]!!
        }

        return ans
    }

    // 1,3,4,2
    private fun getNextGreaterElement(stack: Stack<Int>, v: Int): Int {

        while (stack.isNotEmpty()) {
            val prev = stack.pop()

            if (prev > v) {
                stack.push(prev)
                stack.push(v)
                return prev
            }
        }

        stack.push(v)
        return -1
    }

    override fun run() {
        println(nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2)).toList())
        println(nextGreaterElement(intArrayOf(2, 4), intArrayOf(1, 2, 3, 4)).toList())
    }

}
