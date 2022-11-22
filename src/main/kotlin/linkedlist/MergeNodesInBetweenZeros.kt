package linkedlist

import Problem


/**
 * https://leetcode.com/problems/merge-nodes-in-between-zeros/
 */
class MergeNodesInBetweenZeros : Problem {

    fun mergeNodes(head: ListNode?): ListNode? {
        if (head == null) return null
        val chain = ListNode(0)
        merge(head, chain)
        return chain.next
    }

    private fun merge(node: ListNode?, chain: ListNode, flag: Boolean = false) {
        if (node == null) return

        if (node.`val` == 0) {
            merge(node.next, chain, false)
        } else if (flag) {
            chain.`val` = node.`val` + chain.`val`
            merge(node.next, chain, true)
        } else {
            chain.next = ListNode(node.`val`)
            merge(node.next, chain.next!!, true)
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    override fun run() {
        val root = ListNode(0).apply {
            next = ListNode(3).apply {
                next = ListNode(1).apply {
                    next = ListNode(0).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5).apply {
                                next = ListNode(2).apply {
                                    next = ListNode(0)
                                }
                            }
                        }
                    }
                }
            }
        }
        val r = mergeNodes(root)

        println(r?.`val`)
    }

}
