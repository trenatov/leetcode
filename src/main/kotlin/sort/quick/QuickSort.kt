package sort.quick

import Problem


class QuickSort : Problem {

    fun quicksort(items: List<Int>): List<Int> {
        if (items.size < 2) {
            return items
        }
        val pivot = items[items.size / 2]

        val equal = items.filter { it == pivot }
        val less = items.filter { it < pivot }
        val greater = items.filter { it > pivot }

        return quicksort(less) + equal + quicksort(greater)
    }

    override fun run() {

    }

}
