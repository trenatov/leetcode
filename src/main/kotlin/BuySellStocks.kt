/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
class BuySellStocks : Problem {

    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var min = prices[0]

        for (i in 1 until prices.size) {
            if (prices[i] < min) {
                min = prices[i]
            } else if (prices[i] - min > profit) {
                profit = prices[i] - min
            }
        }
        return profit
    }

    override fun run() {
        val array = intArrayOf(7, 1, 5, 3, 6, 4)
        val array2 = intArrayOf(7, 6, 4, 3, 1)
        val array3 = intArrayOf(2, 4, 1)
        val array4 = intArrayOf(2, 1, 2, 0, 1)
        println(maxProfit(array))
        println(maxProfit(array2))
        println(maxProfit(array3))
        println(maxProfit(array4))
    }

}
