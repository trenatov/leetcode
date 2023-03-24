/**
 * https://leetcode.com/problems/design-hashset/
 */
class DesignHashSet {

    private val map = mutableMapOf<String, Int>()

    fun add(key: Int) {
        map[getKey(key)] = key
    }

    fun remove(key: Int) {
        map.remove(getKey(key))
    }

    fun contains(key: Int): Boolean {
        return map.containsKey(getKey(key))
    }

    private fun getKey(n: Int): String {
        return n.hashCode().toString()
    }

}
