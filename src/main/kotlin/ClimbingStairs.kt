/**
 * https://leetcode.com/problems/climbing-stairs/
 */
class ClimbingStairs : Problem {

    fun climbStairs(n: Int): Int {
        if (n <= 2) return n
        var one = 1
        var two = 2
        for (i in 3..n) {
            val temp = one
            one = two
            two += temp
        }
        return two
    }

    override fun run() {
    }

}
