/**
 * https://leetcode.com/problems/smallest-number-in-infinite-set/
 */
class SmallestNumberInfiniteSet : Problem {

    private val set = mutableSetOf<Int>()
    private var smallest = 1

    fun popSmallest(): Int {
        val curr = smallest
        if(set.isNotEmpty()) {
            val min = set.min()!!
            smallest = Math.min(smallest + 1, min)
        } else {
            smallest++
        }
        return curr
    }

    fun addBack(num: Int) {
        if(!set.contains(num)) {
            set.add(num)
            smallest = Math.min(num, smallest)
        }
    }

    override fun run() {
        //println(lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1)))
    }

}
