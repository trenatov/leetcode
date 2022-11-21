package string

import Problem


/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
class JewelsAndStones : Problem {

    fun numJewelsInStones(jewels: String, stones: String): Int {
        var count = 0

        for (jewel in jewels) {

            for (stone in stones) {
                if (jewel == stone) count++
            }
        }

        return count
    }

    override fun run() {
        println(numJewelsInStones("aA", "aAAbbbb"))
        println(numJewelsInStones("z", "ZZ"))
    }

}
