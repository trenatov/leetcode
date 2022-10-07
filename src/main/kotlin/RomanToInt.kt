/**
 * https://leetcode.com/problems/roman-to-integer/submissions/
 */
class RomanToInt : Problem {

    fun romanToInt(roman: String): Int {
        val array = roman.toCharArray()

        var value = 0
        var prev: Char? = null

        for (c in array) {
            when (c) {
                'I' -> {
                    value += 1
                }

                'V' -> {
                    value += 5

                    if (prev == 'I') value -= 2
                }

                'X' -> {
                    value += 10
                    if (prev == 'I') value -= 2
                }

                'L' -> {
                    value += 50

                    if (prev == 'V') value -= 10
                    if (prev == 'X') value -= 20

                }

                'C' -> {
                    value += 100

                    if (prev == 'X') value -= 20
                }

                'D' -> {
                    value += 500

                    if (prev == 'C') value -= 200
                }

                'M' -> {
                    value += 1000

                    if (prev == 'C') value -= 200
                    if (prev == 'D') value -= 1000
                }
            }

            prev = c
        }

        return value
    }

    override fun run() {
        println(romanToInt("MMMXLV"))
    }

}
