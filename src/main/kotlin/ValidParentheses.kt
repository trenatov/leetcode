import java.util.*


/**
 * https://leetcode.com/problems/valid-parentheses/
 */
class ValidParentheses : Problem {

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s.toCharArray()) {
            if (c == '(') {
                stack.push(')')
            } else if (c == '[') {
                stack.push(']')
            } else if (c == '{') {
                stack.push('}')
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false
            }
        }
        return stack.isEmpty()
    }

    override fun run() {
        println(isValid("("))
        println(isValid("(())"))
        println(isValid("())"))
        println(isValid("()[]{}"))
        println(isValid("([)]"))
    }

}
