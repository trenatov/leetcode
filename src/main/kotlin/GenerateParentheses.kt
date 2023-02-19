/**
 * https://leetcode.com/problems/generate-parentheses/
 */
class GenerateParentheses : Problem {

    fun generateParenthesis(n: Int): List<String> {
        val ans: MutableList<String> = mutableListOf()

        if (n == 0) {
            ans.add("")
        } else {
            for (c in 0 until n) for (left in generateParenthesis(c)) for (right in generateParenthesis(n - 1 - c)) ans.add(
                "($left)$right"
            )
        }

        return ans
    }

    override fun run() {
    }

}
