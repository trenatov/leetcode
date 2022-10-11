/**
 * https://leetcode.com/problems/plus-one/
 */
class PlusOne : Problem {

    fun plusOne(digits: IntArray): IntArray {
        val array = mutableListOf<Int>()
        var remainder = 0
        var index = digits.size - 1

        do {
            var new = digits[index] + remainder

            if (index == digits.size - 1) {
                new += 1
            }

            if (10 == new) {
                remainder = 1
                array.add(0)
            } else if (10 < new) {
                remainder = 1
                array.add(new - 10)
            } else {
                remainder = 0
                array.add(new)
            }

            if (index - 1 < 0 && remainder != 0) {
                array.add(remainder)
                break
            }

            index--

        } while (index >= 0)

        return array.reversed().toIntArray()
    }


    override fun run() {
        println(plusOne(intArrayOf(1, 2, 3)).toList())
        println(plusOne(intArrayOf(4, 3, 2, 1)).toList())
        println(plusOne(intArrayOf(9)).toList())
        println(plusOne(intArrayOf(9, 9, 9, 9)).toList())
    }

}
