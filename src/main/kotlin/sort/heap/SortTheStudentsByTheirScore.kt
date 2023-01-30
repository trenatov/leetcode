package sort.heap

import Problem


/**
 * https://leetcode.com/problems/sort-the-students-by-their-kth-score/
 */
class SortTheStudentsByTheirScore : Problem {

    fun sortTheStudents(score: Array<IntArray>, k: Int): Array<IntArray> {
        val list = mutableListOf<Int>()
        val result = mutableListOf<IntArray>()

        for (i in score.indices) {
            list.add(score[i][k])
        }

        sort(list)

        for (i in list.size - 1 downTo 0) {
            for (j in score.indices) {
                if (score[j][k] == list[i]) {
                    result.add(score[j])
                }
            }
        }

        return result.toTypedArray()
    }

    private fun sort(list: MutableList<Int>) {
        for (i in (list.size / 2) - 1 downTo 0) {
            heapify(list, list.size, i)
        }

        for (i in list.size - 1 downTo 0) {
            val temp = list[0]
            list[0] = list[i]
            list[i] = temp

            heapify(list, i, 0)
        }
    }

    private fun heapify(list: MutableList<Int>, n: Int, i: Int) {
        var greatest = i
        val left = 2 * i + 1
        val right = 2 * i + 2

        if (left < n && list[left] > list[greatest]) greatest = left
        if (right < n && list[right] > list[greatest]) greatest = right

        if (greatest != i) {
            val temp = list[i]
            list[i] = list[greatest]
            list[greatest] = temp

            heapify(list, n, greatest)
        }
    }

    override fun run() {
        println(
            sortTheStudents(
                arrayOf(
                    intArrayOf(10, 6, 9, 1),
                    intArrayOf(7, 5, 11, 2),
                    intArrayOf(4, 8, 3, 15)
                ), 2
            ).toList()
        )
    }

}
