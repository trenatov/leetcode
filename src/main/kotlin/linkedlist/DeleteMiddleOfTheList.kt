package linkedlist

import Problem


/**
 * https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
 */
class DeleteMiddleOfTheList : Problem {

    fun deleteMiddle(head: ListNode?): ListNode? {
        val count = count(head, 0)
        if (count <= 1) return null

        val middle = (count ) / 2
        return removeMiddle(head, middle)
    }

    private fun removeMiddle(root: ListNode?, index: Int): ListNode? {
        if (index == 0) {
            return root?.next
        }

        val node = removeMiddle(root?.next, index - 1)
        root?.next = node
        return root
    }

    private fun count(node: ListNode?, count: Int): Int {
        if (node == null) return count
        return count(node.next, count + 1)
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

        val r = deleteMiddle(root)
        println(r)
    }
}
