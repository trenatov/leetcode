package linkedlist

import Problem
import java.util.*

/**
 * https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
 */
class RemoveZeroSum : Problem {

    fun removeZeroSumSublists(head: ListNode?): ListNode? {
        val stack = Stack<ListNode>()
        var node = head

        while (node != null) {
            if (stack.isEmpty()) {
                stack.push(node)
                node = node.next
                continue
            }

            if (stack.peek().`val` + node.`val` == 0) {
                stack.pop()

                if (stack.isNotEmpty()) {
                    stack.peek().next = null
                }

            } else {
                stack.push(node)
            }

            node = node.next
        }

        node = null
        stack.forEach {
            node?.next = it
            node = it
        }

        if (stack.isEmpty()) return null

        return stack.firstElement()
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {
        val root1 = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(-3).apply {
                    next = ListNode(3).apply {
                        next = ListNode(-2)
                    }
                }
            }
        }

    }

}
