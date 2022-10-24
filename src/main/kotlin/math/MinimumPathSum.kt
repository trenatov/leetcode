package math

import Problem

/**
 * https://leetcode.com/problems/minimum-path-sum/
 */
class MinimumPathSum : Problem {

    fun minPathSum(grid: Array<IntArray>): Int {
        if (grid.isEmpty()) {
            return 0
        }

        for (y: Int in grid.size - 1 downTo 0) {
            for (x: Int in grid[y].size - 1 downTo 0) {
                grid[y][x] += when {
                    y == grid.size - 1 && x == grid[0].size - 1 -> 0
                    y == grid.size - 1 -> grid[y][x + 1]
                    x == grid[0].size - 1 -> grid[y + 1][x]
                    else -> minOf(grid[y + 1][x], grid[y][x + 1])
                }
            }
        }

        return grid[0][0]
    }

    override fun run() {

    }

}
