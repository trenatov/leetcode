package linkedlist

import Problem

/**
 * https://leetcode.com/problems/reverse-linked-list
 */
class ReverseList : Problem {

    fun reverseList(head: ListNode?): ListNode? {
        val root = reverse(head?.next, head)
        head?.next = null
        return root
    }

    private fun reverse(node: ListNode?, prev: ListNode?): ListNode? {
        if (node == null || prev == null) {
            return prev
        }

        val temp = node.next
        node.next = prev
        return reverse(temp, node)
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {
        val root = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }
        val reverseList = reverseList(root)
        println(reverseList)
    }
}
