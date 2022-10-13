/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list
 */
class RemoveNodeFromEnd : Problem {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val nodesCount = countNodes(head, 0)
        return removeNthNode(head, null, nodesCount - n, head)
    }

    private fun removeNthNode(node: ListNode?, prev: ListNode?, n: Int, head: ListNode?): ListNode? {
        if (node == null) return null

        if (n == 0) {
            return if (prev == null) {
                return node.next
            } else {
                prev.next = node.next
                head
            }
        }

        return removeNthNode(node.next, node, n - 1, head)
    }

    private fun countNodes(node: ListNode?, count: Int): Int {
        if (node == null) return count

        return countNodes(node.next, count + 1)
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {
        val root = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(6)
                        }

                    }
                }

            }
        }
        val root2 = ListNode(1)

        val root3 = ListNode(1).apply {
            next = ListNode(2)
        }
        println(removeNthFromEnd(root, 2)?.`val`)
        println(removeNthFromEnd(root2, 1)?.`val`)
        println(removeNthFromEnd(root3, 1)?.`val`)
        println()
    }
}
