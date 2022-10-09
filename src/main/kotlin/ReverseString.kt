/**
 * https://leetcode.com/problems/reverse-string
 */
class ReverseString : Problem {

    fun reverseString(s: CharArray): Unit {
        for (c in 0..(s.size - 1) / 2) {
            val last = s[s.size - 1 - c]
            val first = s[c]

            s[c] = last
            s[s.size - 1 - c] = first
        }
    }

    override fun run() {
        val array = charArrayOf('h', 'e', 'l', 'l', 'o')
        reverseString(array)
        println(array)
    }

}
