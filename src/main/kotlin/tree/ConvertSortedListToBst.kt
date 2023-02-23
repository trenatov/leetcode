package tree

import Problem


/**
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 */
class ConvertSortedListToBst : Problem {

    private var root: TreeNode? = null

    fun sortedListToBST(head: ListNode?): TreeNode? {
        return if (head == null) null else toBST(head, null)
    }

    fun toBST(head: ListNode?, tail: ListNode?): TreeNode? {
        var slow = head
        var fast = head
        if (head === tail) return null
        while (fast !== tail && fast!!.next !== tail) {
            fast = fast!!.next!!.next
            slow = slow!!.next
        }
        val thead = TreeNode(slow!!.`val`)
        thead.left = toBST(head, slow)
        thead.right = toBST(slow.next, tail)
        return thead
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val head = ListNode(-10).apply {
            next = ListNode(-3).apply {
                next = ListNode(0).apply {
                    next = ListNode(5).apply {
                        next = ListNode(9)
                    }
                }
            }
        }
        val r = sortedListToBST(head)
        println(r)
    }
}
