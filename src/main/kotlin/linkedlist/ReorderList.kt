package linkedlist

import Problem

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
class ReorderList : Problem {

    fun reorderList(head: ListNode?): Unit {
        val list = mutableListOf<ListNode?>()
        var node = head
        while (node != null) {
            list.add(node)
            node = node.next
        }

        var i = 0
        var j = list.size - 1

        var prev: ListNode? = null
        while (i <= j) {
            if (i == j) {
                prev?.next = list[i]
                prev = list[i]
                break
            }

            prev?.next = list[i]
            list[i]?.next = list[j]
            prev = list[j]

            i++
            j--
        }
        prev?.next = null

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

        reorderList(root)
        println(root)
    }

}
