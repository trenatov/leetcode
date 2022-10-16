package math

import Problem

/**
 * https://leetcode.com/problems/add-binary/
 */
class AddBinary : Problem {

    fun addBinary(a: String, b: String): String {
        val least = if (a.length <= b.length) a.toCharArray() else b.toCharArray()
        val most = if (b.length < a.length) a.toCharArray() else b.toCharArray()
        val resultArray = mutableListOf<Char>()
        var remainder = 0
        var leastIndex = least.size - 1

        for (i in most.lastIndex downTo 0) {
            val mostV = most[i].toString().toInt()

            val sumResult = if (leastIndex >= 0) {
                val leastV = least[leastIndex].toString().toInt()
                leastIndex--
                when (val sum = mostV + leastV + remainder) {
                    2 -> {
                        remainder = 1
                        '0'
                    }

                    3 -> {
                        remainder = 1
                        '1'
                    }

                    else -> {
                        remainder = 0
                        Character.forDigit(sum, 10)
                    }
                }
            } else {
                val result = when (val sum = mostV + remainder) {
                    2 -> {
                        remainder = 1
                        '0'
                    }

                    else -> {
                        remainder = 0
                        Character.forDigit(sum, 10)
                    }
                }
                result
            }

            resultArray.add(sumResult)

            if (i == 0 && remainder != 0) {
                resultArray.add('1')
            }
        }
        resultArray.reverse()

        return String(resultArray.toCharArray())
    }


    override fun run() {
        println(addBinary("11", "1"))
        println(addBinary("1010", "1011"))
        println(addBinary("0", "0"))
    }

}
