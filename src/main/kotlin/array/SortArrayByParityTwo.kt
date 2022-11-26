package array

import Problem


/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 */
class SortArrayByParityTwo : Problem {

    fun sortArrayByParityII(nums: IntArray): IntArray {
        val even: MutableList<Int> = ArrayList()
        val odd: MutableList<Int> = ArrayList()

        for (n in nums) {
            if (n % 2 == 0) even.add(n) else odd.add(n)
        }
        val result = IntArray(nums.size)
        for (i in nums.indices) {
            if (i % 2 == 0) {
                result[i] = even.removeAt(0)
            } else {
                result[i] = odd.removeAt(0)
            }
        }
        return result
    }

    override fun run() {
        println(sortArrayByParityII(intArrayOf(4, 2, 5, 7)).toList())
        println(sortArrayByParityII(intArrayOf(2, 3)).toList())
    }

}
