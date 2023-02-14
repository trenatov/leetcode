package string

import Problem


/**
 * https://leetcode.com/problems/destination-city/
 */
class DestinationCity : Problem {

    fun destCity(paths: List<List<String>>): String {
        val map = paths.map { it[0] to it[1] }.toMap()

        for (s in paths) {
            val point = s[1]
            if (map[point] == null) {
                return point
            }
        }
        return ""
    }

    override fun run() {

    }

}
