/**
 * https://leetcode.com/problems/minimum-moves-to-reach-target-score/
 */
class MinimumMovesToReachTarget : Problem {

    fun minMoves(target: Int, maxDoubles: Int): Int {
        if (target == 1) return 0

        var count = 0
        var current = target
        var doubles = maxDoubles

        while (current != 1) {
            count++
            if (doubles <= 0) {
                current--
                continue
            }

            if (current % 2 == 0) {
                current /= 2
                doubles--
            } else {
                current--
            }
        }

        return count
    }

    override fun run() {
        println(minMoves(5, 0))
        println(minMoves(19, 2))
        println(minMoves(10, 4))
    }

}
