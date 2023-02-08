package greedy

import Problem

/**
 * https://leetcode.com/problems/maximum-69-number/
 */
class Maximum69Number : Problem {

    fun maximum69Number(num: Int): Int {
        val array = num.toString().toCharArray()
        for (i in array.indices) {
            if (array[i] == '6') {
                array[i] = '9' - 0
                break
            }
        }

        var multiplier = 1
        var result = 0

        for (i in array.size - 1 downTo 0) {
            result += (array[i] - '0') * multiplier
            multiplier *= 10
        }

        return result
    }

    override fun run() {
        println(maximum69Number(9669))
    }

}
