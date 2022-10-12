/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii
 */
class ReverseString2 : Problem {

    fun reverseWords(s: String): String {
        val array = s.toCharArray()
        var index = 0

        do {
            val current = array[index]

            if (current == ' ') {
                index++
            } else {
                index = findWord(array, index)
            }

        } while (index < array.size - 1)

        return String(array)
    }

    private fun findWord(array: CharArray, index: Int): Int {
        var i = index
        do {
            if (i == array.size) return array.size

            val current = array[i]
            if (current == ' ') {
                swap(array, index, i - 1)
                return i
            }
            if (i == array.size - 1) {
                swap(array, index, i)
                return i
            }

            i++
        } while (true)
    }

    private fun swap(array: CharArray, from: Int, to: Int) {
        var down = to
        for (i in from..(from + to) / 2) {
            val fromVal = array[i]
            val toVal = array[down]

            array[down] = fromVal
            array[i] = toVal
            down--
        }
    }

    override fun run() {
        println(reverseWords("Kc contest"))
        println(reverseWords("God Ding"))
        println(reverseWords("Sock"))
    }

}
