package linkedlist

import Problem


/**
 * https://leetcode.com/problems/linked-list-cycle
 */
class LinkedListCycle : Problem {

    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head
        while (fast?.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next
            if (fast === slow) {
                return true
            }
        }
        return false
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {

    }
}
