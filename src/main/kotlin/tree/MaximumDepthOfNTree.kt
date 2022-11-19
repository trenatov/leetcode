package tree

import Problem


/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
class MaximumDepthOfNTree : Problem {

    fun maxDepth(root: Node?): Int {
        if (root == null) return 0
        var maxChild = 0
        for (child in root.children) {
            maxChild = Math.max(maxChild, maxDepth(child))
        }
        return maxChild + 1
    }


    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }

    override fun run() {
    }

}
