/**
 * https://leetcode.com/problems/last-stone-weight/
 */
class LastStoneWeight : Problem {

    fun lastStoneWeight(stones: IntArray): Int {
        return traverse(stones.toMutableList())
    }

    private fun traverse(list: MutableList<Int>): Int {
        if (list.size == 1) return list[0]
        if (list.size == 0) return 0
        list.sort()
        val x = list[list.lastIndex - 1]
        val y = list[list.lastIndex]

        return if (x == y) {
            list.removeAt(list.lastIndex - 1)
            list.removeAt(list.lastIndex)
            traverse(list)
        } else {
            list.removeAt(list.lastIndex - 1)
            list[list.lastIndex] = y - x
            traverse(list)
        }
    }

    override fun run() {
        //println(lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1)))
        println(lastStoneWeight(intArrayOf(2, 2)))
    }

}
