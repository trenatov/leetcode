/**
 * https://leetcode.com/problems/perfect-number/
 */
class PerfectNumber : Problem {

    fun checkPerfectNumber(num: Int): Boolean {
        val divisors = mutableListOf<Int>()
        for (n in 1 until (num / 2) + 1) {
            if (num % n == 0) divisors.add(n)
        }
        return divisors.sum() == num
    }

    override fun run() {
        println(checkPerfectNumber(28))
        println(checkPerfectNumber(7))
    }

}
