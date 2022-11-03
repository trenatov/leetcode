package string

import Problem



class AlienDictionary : Problem {

    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        var arr = IntArray(26)
        for ((idx, c) in order.withIndex()) arr[c - 'a'] = idx
        for (i in 0 until words.size - 1) {
            var first = words[i];
            var second = words[i + 1]
            var j = 0;
            var minLength = Math.min(first.length, second.length)
            while (j < minLength) {
                if (arr[first[j] - 'a'] > arr[second[j] - 'a']) return false
                else if (arr[first[j] - 'a'] < arr[second[j] - 'a']) break
                j++
            }
            if (j == second.length && j < first.length) return false
        }

        return true
    }

    override fun run() {
    }

}
