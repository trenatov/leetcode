/**
 * https://leetcode.com/contest/weekly-contest-333/problems/minimum-operations-to-reduce-an-integer-to-0/
 */
class MinOperationsToReduceIntToZero : Problem {

    fun minOperations(n: Int): Int {
        var current = n
        var c = 0
        while (current != 0) {
            if (current % 2 == 1) {
                if (current == 1 || current and 2 == 0) {
                    current -= 1
                } else {
                    current += 1
                }
                c++
            } else {
                current /= 2
            }
        }
        return c
    }

    override fun run() {
        println(minOperations(39))
        println(minOperations(54))
    }

}
