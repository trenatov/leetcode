/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
class InorderTraversal : Problem {

    fun inorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        iterate(root, list)
        return list
    }

    private fun iterate(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return

        iterate(node.left, list)
        list.add(node.`val`)
        iterate(node.right, list)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(1).apply {
            right = TreeNode(2).apply {
                left = TreeNode(3)
            }
        }

        println(inorderTraversal(root))
    }

}
