/**
 * https://leetcode.com/problems/isomorphic-strings/
 */
class IsomorphicStrings : Problem {

    fun isIsomorphic(s: String, t: String): Boolean {
        val map = mutableMapOf<Any, Int>()
        val array1 = s.toCharArray()
        val array2 = t.toCharArray()

        for (i in array1.indices) {
            if (map.put(array1[i], i) != map.put(array2[i], i)) return false
        }
        return true
    }

    override fun run() {
        println(isIsomorphic("paper", "title"))
    }

}
