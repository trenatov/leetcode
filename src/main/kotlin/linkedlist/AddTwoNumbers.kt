package linkedlist

import Problem

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
class AddTwoNumbers : Problem {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val list = ListNode(0)
        add(list, l1, l2, 0)
        return list.next
    }

    private fun add(node: ListNode, first: ListNode?, second: ListNode?, remainder: Int) {
        if (first == null && second == null && remainder > 0) {
            node.next = ListNode(remainder)
            return
        }

        if (first == null && second == null) return

        val firstValue = first?.`val` ?: 0
        val secondValue = second?.`val` ?: 0

        val sum = firstValue + secondValue + remainder
        val rem: Int

        val value = if (sum >= 10) {
            rem = 1
            sum - 10
        } else {
            rem = 0
            sum
        }

        node.next = ListNode(value)
        add(node.next!!, first?.next, second?.next, rem)
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

        val root2 = ListNode(5).apply {
            next = ListNode(6).apply {
                next = ListNode(4)
            }
        }

        val r = addTwoNumbers(root1, root2)

        println(r?.`val`)
    }

}
