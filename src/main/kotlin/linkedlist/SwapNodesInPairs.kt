package linkedlist

import Problem


/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
class SwapNodesInPairs : Problem {

    fun swapPairs(head: ListNode?): ListNode? {
        if (head == null) return null
        if (head.next == null) return head
        val newHead = head.next
        swap(head)
        return newHead
    }

    private fun swap(head: ListNode?) {
        if (head?.next == null) return

        val temp: ListNode? = head.next

        head.next = head.next?.next

        temp?.next = head

        var temp2: ListNode? = null

        if (head.next != null) temp2 = head.next?.next
        swap(head.next)

        if (temp2 != null) head.next = temp2
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                        .apply {
                        next = ListNode(5).apply {
                            next = ListNode(6)
                        }
                    }
                }
            }
        }

        val swapPairs = swapPairs(head)
        println(swapPairs)
    }

}
