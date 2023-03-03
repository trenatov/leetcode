package greedy

import Problem


/**
 * https://leetcode.com/problems/append-k-integers-with-minimal-sum/description/
 */
class AppendKIntegersWithMinSum : Problem {

    fun minimalKSum(nums: IntArray, k: Int): Long {
        nums.sort()

        var sum = 0L
        var index = 0
        var n = 1

        // 1, 2, 3, 5
        repeat(k) {
            while (index < nums.size && nums[index] == n) {
                n++
                while (index < nums.size && nums[index] < n) {
                    index++
                }
            }
            sum += n
            n++
        }

        return sum
    }

    override fun run() {
        println(
            minimalKSum(
                intArrayOf(
                    96,
                    44,
                    99,
                    25,
                    61,
                    84,
                    88,
                    18,
                    19,
                    33,
                    60,
                    86,
                    52,
                    19,
                    32,
                    47,
                    35,
                    50,
                    94,
                    17,
                    29,
                    98,
                    22,
                    21,
                    72,
                    100,
                    40,
                    84
                ), 35
            )
        )
    }

}
