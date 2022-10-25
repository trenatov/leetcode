package linkedlist

import Problem


/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
class MergeKSortedList : Problem {

    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        return if (lists.isEmpty()) null else merge(lists, 0, lists.size - 1)
    }

    fun merge(lists: Array<ListNode?>, left: Int, right: Int): ListNode? {
        // base case
        if (left == right) return lists[left]
        val mid = left + (right - left) / 2
        val l1 = merge(lists, left, mid)
        val l2 = merge(lists, mid + 1, right)
        return mergeTwoLists(l1, l2)
    }

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
