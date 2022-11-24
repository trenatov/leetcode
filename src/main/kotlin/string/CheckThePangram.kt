package string

import Problem


/**
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */
class CheckThePangram : Problem {

    fun checkIfPangram(sentence: String): Boolean {
        for (c in "thequickbrownfoxjumpsoverthelazydog") {
            if (!sentence.contains(c)) return false
        }
        return true
    }

    override fun run() {

    }

}
