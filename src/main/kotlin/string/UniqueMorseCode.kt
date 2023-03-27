package string

import Problem


/**
 * https://leetcode.com/problems/unique-morse-code-words/
 */
class UniqueMorseCode : Problem {

    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val list = listOf(
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        )
        return words.map {
            it.map { c -> list[(c - 'a')] }
                .joinToString("")
        }.toSet().size
    }

    override fun run() {
        println('z'- 'a')
        println(uniqueMorseRepresentations(arrayOf("a")))
    }

}
