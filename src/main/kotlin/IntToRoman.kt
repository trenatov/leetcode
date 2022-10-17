/**
 * https://leetcode.com/problems/integer-to-roman/
 */
class IntToRoman : Problem {

    fun intToRoman(num: Int): String {
        val values = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val code = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

        val sb = StringBuilder()
        var numCopy = num

        while (numCopy > 0) {
            for (i in 0..12) {
                if (numCopy >= values[i]) {
                    numCopy -= values[i]
                    sb.append(code[i])
                    break
                }
            }
        }

        return sb.toString()
    }

    override fun run() {
    }

}
