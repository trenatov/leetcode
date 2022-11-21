/**
 * https://leetcode.com/problems/self-dividing-numbers/solution/
 */
class SelfDividingNumbers : Problem {

    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val ans = mutableListOf<Int>()
        for (n in left..right) {
            if (selfDividing(n)) ans.add(n)
        }
        return ans
    }

    fun selfDividing(n: Int): Boolean {
        for (c in n.toString().toCharArray()) {
            if (c == '0' || n % (c - '0') > 0) return false
        }
        return true
    }

    override fun run() {
    }

}
