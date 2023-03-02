package linkedlist

import Problem
import java.util.*

/**
 * https://leetcode.com/problems/next-greater-node-in-linked-list/
 */
class NextGreaterNode : Problem {

    fun nextLargerNodes(head: ListNode?): IntArray {
        val stack = Stack<Pair<Int, Int>>()
        var node = head
        var i = 0
        var n = 0

        while (node != null) {
            n++
            node = node.next
        }

        node = head

        val ans = IntArray(n)

        while (node != null) {
            if (stack.isNotEmpty() && stack.peek().second < node.`val`) {
                traverse(node, stack, ans)
            }

            stack.push(Pair(i, node.`val`))
            i++
            node = node.next
        }

        return ans
    }

    private fun traverse(node: ListNode, stack: Stack<Pair<Int, Int>>, array: IntArray) {
        while (stack.isNotEmpty()) {
            val prev = stack.pop()
            if (prev.second < node.`val`) {
                array[prev.first] = node.`val`
            } else {
                stack.push(prev)
                return
            }
        }
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
        val list = mutableListOf<Int>()
        list[5] = 1

        println(list)
    }

}
