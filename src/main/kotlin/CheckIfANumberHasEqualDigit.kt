/**
 * https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
 */
class CheckIfANumberHasEqualDigit : Problem {

    fun digitCount(num: String): Boolean {
        val array = num.toCharArray()

        for (i in array.indices) {
            var times = 0

            for (j in array.indices) {
                if (array[j] - '0' == i) {
                    times++
                }
            }

            if (array[i] - '0' != times) {
                return false
            }
        }

        return true
    }

    override fun run() {
        println(digitCount("1210"))
    }


}
