package math

import Problem


/**
 * https://leetcode.com/problems/determine-color-of-a-chessboard-square/
 */
class DetermineColorInChessboard : Problem {

    fun squareIsWhite(coordinates: String): Boolean {
        val map = mapOf(
            'a' to 1,
            'b' to 2,
            'c' to 3,
            'd' to 4,
            'e' to 5,
            'f' to 6,
            'g' to 7,
            'h' to 8
        )
        val c = coordinates.toCharArray()
        val number = map[c[0]]!! + (c[1] - '0')
        return number % 2 != 0
    }

    override fun run() {

    }

}
