/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
class NumberOfSteps : Problem {

    fun numberOfSteps(num: Int): Int {
        var count = 0
        var number = num

        while (number != 0) {
            if (number % 2 == 0) {
                number /= 2
            } else {
                number--
            }
            count++
        }

        return count
    }

    override fun run() {
        println(numberOfSteps(8))
    }

}
