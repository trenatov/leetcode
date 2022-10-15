/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
class RemoveDuplicatesFromSortedList : Problem {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        remove(head)
        return head
    }

    private fun remove(node: ListNode?) {
        if (node?.next == null) return

        if (node.`val` == node.next!!.`val`) {
            node.next = node.next?.next
            remove(node)
            return
        }

        remove(node.next)
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {
        val root = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(4)
                }
            }
        }

        val result = deleteDuplicates(root)
        println(result?.`val`)
    }
}
