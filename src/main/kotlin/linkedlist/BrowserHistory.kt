package linkedlist

class BrowserHistory(homepage: String) {

    private var node: Node = Node(homepage)

    fun visit(url: String) {
        val new = Node(url, node)
        node.next = new
        node = new
    }

    fun back(steps: Int): String {
        var curr = steps

        while (curr > 0 && node.prev != null) {
            curr--
            node = node.prev!!
        }

        return node.url
    }

    fun forward(steps: Int): String {
        var curr = steps

        while (curr > 0 && node.next != null) {
            curr--
            node = node.next!!
        }

        return node.url
    }


    class Node(val url: String, var prev: Node? = null, var next: Node? = null)

}
