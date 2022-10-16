/**
 * https://leetcode.com/problems/valid-palindrome/
 */
class ValidPalindrome : Problem {

    fun isPalindrome(s: String): Boolean {
        val array = s.toLowerCase().toCharArray()

        val filteredList = mutableListOf<Char>()
        for (c in array) {
            if (!c.isLetter() && !c.isDigit()) {
                continue
            }
            c.isDefined()

            filteredList.add(c)
        }

        val size = filteredList.size - 1
        if (size <= 0) return true

        for (i in 0..size / 2) {
            val start = filteredList[i]
            val end = filteredList[size - i]

            if (start != end) return false
        }

        return true
    }

    override fun run() {
        // println(isPalindrome("A man, a plan, a canal: Panama"))
        //println(isPalindrome("race a car"))
        println(isPalindrome("0P"))
    }

}
