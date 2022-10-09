
/**
 * https://leetcode.com/problems/powx-n/
 */
class PowerOf : Problem {

    fun myPow(x: Double, n: Int): Double {
        return if (n == 0) 1.0
        else if (n % 2 == 1) x * myPow(x, n - 1)
        else if (n % 2 == 0) myPow(x * x, n / 2)
        else 1 / myPow(x, -n);
    }

    override fun run() {
        println(myPow(2.10000, 3))
        println(myPow(2.00000, -2))
    }

}
