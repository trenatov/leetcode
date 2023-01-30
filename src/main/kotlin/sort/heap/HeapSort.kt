package sort.heap

import Problem


class HeapSort : Problem {

    fun sort(arr: IntArray): IntArray {
        for (i in arr.size / 2 - 1 downTo 0) {
            heapify(arr, arr.size, i)
        }

        for (i in arr.size - 1 downTo 0) {
            val temp = arr[0]
            arr[0] = arr[i]
            arr[i] = temp

            heapify(arr, i, 0)
        }

        return arr
    }

    private fun heapify(array: IntArray, n: Int, index: Int) {
        var largest = index
        val left = 2 * index + 1
        val right = 2 * index + 2

        if (left < n && array[left] > array[largest]) {
            largest = left
        }

        if (right < n && array[right] > array[largest]) {
            largest = right
        }

        if (largest != index) {
            val temp = array[largest]
            array[largest] = array[index]
            array[index] = temp

            heapify(array, n, largest)
        }
    }

    override fun run() {
        println(sort(intArrayOf(4, 1, 7, 9)).toList())
    }

}
