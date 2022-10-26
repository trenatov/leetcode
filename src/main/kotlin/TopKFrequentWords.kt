/**
 * https://leetcode.com/problems/top-k-frequent-words/
 */
class TopKFrequentWords : Problem {

    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        return words.groupingBy { it }.eachCount()
            .toList()
            .sortedBy { (s, _) -> s }
            .sortedByDescending { (_, v) -> v }
            .map { it.first }
            .take(k)
    }

    override fun run() {
    }

}
