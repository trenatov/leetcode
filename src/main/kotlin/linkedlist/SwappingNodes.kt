package linkedlist

import Problem

/**
 * https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
 */
class SwappingNodes : Problem {

    fun swapNodes(head: ListNode?, k: Int): ListNode? {
        var node = head
        val list = mutableListOf<ListNode>()

        while (node != null) {
            list.add(node)
            node = node.next
        }

        val i = k - 1
        val j = list.size - k

        val left = list[i]
        val right = list[j]

        val temp = left.`val`
        left.`val` = right.`val`
        right.`val` = temp

        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val r = swapNodes(head, 2)
        println(r)
    }
}
