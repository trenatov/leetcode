package array

import Problem


/**
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
 */
class TicTacToe : Problem {

    fun tictactoe(moves: Array<IntArray>): String {
        val grid = fill(moves)

        for (i in 0..3) {
            if (allVertically(grid, i, 1) || allDiagonally(grid, 1) || allHorizontally(grid, i, 1)) {
                return "A"
            } else if (allVertically(grid, i, 2) || allDiagonally(grid, 2) || allHorizontally(grid, i, 2)) {
                return "B"
            }
        }

        if (moves.size < 9) return "Pending"

        return "Draw"
    }

    private fun allHorizontally(grid: Array<IntArray>, i: Int, v: Int): Boolean {
        return grid[i][0] == v && grid[i][1] == v && grid[i][2] == v
    }

    private fun allVertically(grid: Array<IntArray>, j: Int, v: Int): Boolean {
        return grid[0][j] == v && grid[1][j] == v && grid[2][j] == v
    }

    private fun allDiagonally(grid: Array<IntArray>, v: Int): Boolean {
        return (grid[0][0] == v && grid[1][1] == v && grid[2][2] == v) || (grid[0][2] == v && grid[1][1] == v && grid[2][0] == v)
    }

    private fun fill(moves: Array<IntArray>): Array<IntArray> {
        val grid = Array(3) { IntArray(3) }

        var isA = true
        for (i in moves) {
            if (isA) {
                grid[i[0]][i[1]] = 1
                isA = false
            } else {
                isA = true
                grid[i[0]][i[1]] = 2
            }
        }

        return grid
    }

    override fun run() {
    }

}
