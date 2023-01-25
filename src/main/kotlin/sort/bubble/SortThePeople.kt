package sort.bubble

import Problem


/**
 * https://leetcode.com/problems/sort-the-people/
 */
class SortThePeople : Problem {

    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {

        for (i in names.indices) {
            for (j in i + 1 until names.size) {
                if (heights[i] > heights[j]) {
                    val name = names[i]
                    names[i] = names[j]
                    names[j] = name

                    val height = heights[i]
                    heights[i] = heights[j]
                    heights[j] = height
                }
            }
        }

        return names.reversed().toTypedArray()
    }

    override fun run() {
        println(sortPeople(arrayOf("a", "b", "c"), intArrayOf(155, 185, 150)).toList())
    }

}
