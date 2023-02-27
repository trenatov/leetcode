package array

import Problem


/**
 * https://leetcode.com/problems/max-area-of-island/description/
 */
class MaxAreaOfIsland : Problem {

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val islands = mutableSetOf<Pair<Int, Int>>()
        var max = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                val pair = Pair(i, j)
                if (grid[i][j] == 1 && !islands.contains(pair)) {
                    val island = findIsland(grid, islands, pair)
                    islands.addAll(island)
                    max = Math.max(max, island.size)
                }
            }
        }

        return max
    }

    private fun findIsland(
        grid: Array<IntArray>,
        set: MutableSet<Pair<Int, Int>>,
        pair: Pair<Int, Int>
    ): List<Pair<Int, Int>> {
        if (set.contains(pair)) return emptyList()

        val islands = mutableListOf(pair)
        val i = pair.first
        val j = pair.second

        if (j - 1 >= 0 && grid[i][j - 1] == 1 && !set.contains(Pair(i, j - 1))) {
            val new = Pair(i, j - 1)
            val neighbors = findIsland(grid, set, new)
            islands.add(new)
            islands.addAll(neighbors)
        }

        if (j + 1 <= grid[i].lastIndex && grid[i][j + 1] == 1 && !set.contains(Pair(i, j + 1))) {
            val new = Pair(i, j + 1)
            val neighbors = findIsland(grid, set, new)
            islands.add(new)
            islands.addAll(neighbors)
        }

        if (i - 1 >= 0 && grid[i - 1][j] == 1 && !set.contains(Pair(i - 1, j))) {
            val new = Pair(i - 1, j)
            val neighbors = findIsland(grid, set, new)
            islands.add(new)
            islands.addAll(neighbors)
        }

        if (i + 1 <= grid.lastIndex && grid[i + 1][j] == 1 && !set.contains(Pair(i + 1, j))) {
            val new = Pair(i + 1, j)
            val neighbors = findIsland(grid, set, new)
            islands.add(new)
            islands.addAll(neighbors)
        }

        return islands
    }

    override fun run() {

    }

}
