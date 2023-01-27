package sort.quick

import Problem


class MaximumProductOfTwoArray : Problem {

    fun maxProduct(nums: IntArray): Int {
        val sorted = quicksort(nums.toList())

        return (sorted[nums.size - 1] - 1) * (sorted[nums.size - 2] - 1)
    }

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
        println(maxProduct(intArrayOf(3, 4, 5, 2)))
        println(maxProduct(intArrayOf(1, 5, 4, 5)))
    }

}
