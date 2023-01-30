/**
 * https://leetcode.com/problems/n-th-tribonacci-number/description/
 */
class TribonacciNumber : Problem {

    fun tribonacci(n: Int): Int {
        if (n == 0) return 0
        if (n == 1 || n == 2) return 1
        val array = IntArray(n + 1)
        array[0] = 0
        array[1] = 1
        array[2] = 1

        for (i in 3..n) {
            array[i] = array[i - 1] + array[i - 2] + array[i - 3]
        }

        return array[n]
    }

    override fun run() {
        println(tribonacci(25))
    }

}
