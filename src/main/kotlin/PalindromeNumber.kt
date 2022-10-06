/**
 * https://leetcode.com/problems/palindrome-number/
 */
class PalindromeNumber : Problem {

    fun isPalindrome(x: Int): Boolean {
        val array = x.toString().toCharArray()
        val size = array.size - 1

        for (i in 0..size / 2) {
            val start = array[i]
            val end = array[size - i]

            if (start != end) return false
        }

        return true
    }

    override fun run() {
        println(isPalindrome(121))
        println(isPalindrome(-121))
        println(isPalindrome(10))
    }

}
