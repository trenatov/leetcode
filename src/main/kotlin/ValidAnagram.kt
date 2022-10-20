/**
 * https://leetcode.com/problems/valid-anagram/
 */
class ValidAnagram : Problem {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val array1 = s.toCharArray()
        val array2 = t.toCharArray()

        array1.sort()
        array2.sort()

        return array1.contentEquals(array2)
    }

    override fun run() {
        println(isAnagram("anagram", "nagaram"))
        println(isAnagram("rat", "car"))
    }

}
