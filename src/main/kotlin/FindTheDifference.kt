/**
 * https://leetcode.com/problems/find-the-difference/
 */
class FindTheDifference : Problem {

    fun findTheDifference(s: String, t: String): Char {
        val array1 = s.toCharArray()
        val array2 = t.toCharArray()

        array1.sort()
        array2.sort()

        for (i in array1.indices) {
            val val1 = array1[i]
            val val2 = array2[i]

            if (val1 != val2) return val2
        }

        return array2.last()
    }

    override fun run() {
        println(findTheDifference("abcde", "abtcde"))
    }

}
