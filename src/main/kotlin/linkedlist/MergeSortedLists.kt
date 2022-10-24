package linkedlist

import Problem

/**
 * https://leetcode.com/problems/merge-two-sorted-lists
 */
class MergeSortedLists : Problem {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null && list2 == null) {
            return null
        }
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }
        if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            return list1
        }

        list2.next = mergeTwoLists(list2.next, list1)
        return list2
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {

    }
}
