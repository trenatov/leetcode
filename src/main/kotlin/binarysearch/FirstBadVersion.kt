package binarysearch

import Problem

/**
 * https://leetcode.com/problems/first-bad-version/
 */
class FirstBadVersion : Problem {

    fun firstBadVersion(n: Int): Int {
        return find(1, n)
    }

    private fun find(left: Int, right: Int): Int {
        if (left > right) return left

        val mid = left + (right - left) / 2

        return if (isBadVersion(mid)) {
            find(left, mid)
        } else {
            find(mid + 1, right)
        }
    }

    private fun isBadVersion(n: Int): Boolean = n >= 2

    override fun run() {
        println(firstBadVersion(3))
    }

}
