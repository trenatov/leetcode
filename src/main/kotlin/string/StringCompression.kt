package string

import Problem


/**
 * https://leetcode.com/problems/string-compression/
 */
class StringCompression : Problem {

    fun compress(chars: CharArray): Int {
        var count = 0
        var streaks = 1
        var prev = ' '

        for (c in chars) {
            if (prev == c) {
                streaks++
            } else {
                if (streaks > 1) {
                    count += streaks.toString().length
                }
                count++
                streaks = 1
            }

            prev = c
        }

        if (streaks > 1) {
            count += streaks.toString().length
        }

        return count
    }

    override fun run() {
        println(compress(charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')))
    }

}
