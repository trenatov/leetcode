/**
 * https://leetcode.com/problems/length-of-last-word/
 */
class LengthOfLastString : Problem {

    fun lengthOfLastWord(s: String): Int {
        val array = s.toCharArray()

        for (index in array.indices.reversed()) {

            if (array[index] == ' ' && containsWordAfter(array, index)) {
                return getSize(array, index + 1)
            }

        }

        return getSize(array, 0)
    }

    private fun getSize(array: CharArray, index: Int): Int {
        var size = 0
        for (i in index until array.size) {
            if (array[i] == ' ') return size

            size++
        }

        return size
    }

    private fun containsWordAfter(array: CharArray, index: Int): Boolean {
        if (index + 1 == array.size) return false

        for (i in index + 1 until array.size) {
            if (array[i] != ' ') return true
        }

        return false
    }

    override fun run() {
        println(lengthOfLastWord("Hello World"))
        println(lengthOfLastWord("t mo "))
        println(lengthOfLastWord("a"))
        println(lengthOfLastWord("a "))
    }

}
