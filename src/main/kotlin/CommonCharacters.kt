/**
 * https://leetcode.com/problems/find-common-characters/
 */
class CommonCharacters : Problem {

    fun commonChars(words: Array<String>): List<String> {
        val characters = Array(26) { IntArray(words.size) }
        for (i in words.indices)
            for (c in words[i])
                characters[c - 'a'][i]++
        return characters
            .withIndex()
            .map { (c, words) -> List(words.min()) { ('a' + c).toString() } }
            .flatten()
    }

    override fun run() {

    }

}
