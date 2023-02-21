package linkedlist

import Problem
import java.util.*

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
class ConvertBinary : Problem {

    fun getDecimalValue(head: ListNode?): Int {
        var node = head
        val binary = Stack<Int>()

        while (node != null) {
            binary.push(node.`val`)
            node = node.next
        }

        var answer = 0.0
        var index = 0.0
        while (binary.isNotEmpty()) {
            val bit = binary.pop()
            answer += Math.pow(2 * 1.0, index) * bit
            index++
        }

        return answer.toInt()
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {
        val root1 = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }

    }

}
