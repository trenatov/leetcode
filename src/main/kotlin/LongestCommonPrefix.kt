/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
class LongestCommonPrefix : Problem {

    fun longestCommonPrefix(strs: Array<String>): String {
        val list = strs.sortedBy { it.length }
        if (list.size == 1) return list.first()

        val first = list.first().toCharArray()

        for (i in first.indices) {
            val currentChar = first[i]

            for (j in 1 until list.size) {
                val array = list[j].toCharArray()

                val jChar = array[i]

                if (0 != i && currentChar != jChar) {
                    return list.first().take(i)
                } else if (0 == i && currentChar != jChar) {
                    return ""
                }
            }
        }

        return list.first()
    }

    override fun run() {
        println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
        println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
        println(longestCommonPrefix(arrayOf("ab", "a")))
    }

}
