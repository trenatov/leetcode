/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
class NumberOfStepsBinary : Problem {

    fun numSteps(s: String): Int {
        var res = 0
        var carry = 0
        for (i in s.length - 1 downTo 1) {
            ++res
            if (s.toCharArray()[i] - '0' + carry == 1) {
                carry = 1
                ++res
            }
        }
        return res + carry
    }


    override fun run() {
        println(numSteps("1101"))
    }

}
