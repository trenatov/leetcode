package linkedlist

import Problem


/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
class RemoveElement : Problem {

    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        if (head == null) {
            return null
        }

        val node = removeElements(head.next, `val`)
        if (head.`val` == `val`) {
            return node
        }

        head.next = node
        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {
        val root = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(6).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(6)
                        }
                    }
                }
            }
        }

        val r = removeElements(root, 6)
        println(r)
    }
}
