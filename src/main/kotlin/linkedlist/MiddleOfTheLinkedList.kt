package linkedlist

import Problem

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
class MiddleOfTheLinkedList : Problem {

    fun middleNode(head: ListNode?): ListNode? {
        val nodeCount = countNodes(head, 0)

        val middle = nodeCount / 2

        return getMiddleNode(head, middle)
    }

    private fun getMiddleNode(node: ListNode?, index: Int): ListNode? {
        if (node == null || index == 0) return node

        return getMiddleNode(node.next, index - 1)
    }

    private fun countNodes(node: ListNode?, count: Int): Int {
        if (node == null) return count
        return countNodes(node.next, count + 1)
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {
        val root = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(6)
                        }

                    }
                }

            }
        }
        println(middleNode(root)?.`val`)
    }
}
