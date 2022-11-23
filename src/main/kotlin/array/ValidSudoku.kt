package array

import Problem


/**
 * https://leetcode.com/problems/valid-sudoku/
 */
class ValidSudoku : Problem {

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            for (j in 0 until 9) {
                if (board[i][j] != '.'
                    && (!isDistinctInRow(board[i], j)
                            || !isDistinctInColumn(board, i, j)
                            || !isDistinctInBox(board, i, j))
                ) {
                    return false
                }
            }
        }
        return true
    }

    private fun isDistinctInRow(array: CharArray, index: Int): Boolean {
        for (i in array.indices) {
            if (i != index && array[i] == array[index]) {
                return false
            }
        }

        return true
    }

    private fun isDistinctInColumn(board: Array<CharArray>, i: Int, j: Int): Boolean {
        for (index in board.indices) {
            if (index != i && board[i][j] == board[index][j]) {
                return false
            }
        }

        return true
    }

    private fun isDistinctInBox(board: Array<CharArray>, i: Int, j: Int): Boolean {
        for (index in resolveBox(i) - 2..resolveBox(i)) {
            for (jindex in resolveBox(j) - 2..resolveBox(j)) {
                if ((index != i && jindex != j) && board[i][j] == board[index][jindex]) {
                    return false
                }
            }
        }

        return true
    }

    private fun resolveBox(index: Int): Int {
        return if (index <= 2) {
            2
        } else if (index <= 5) {
            5
        } else if (index <= 8) {
            8
        } else -1
    }

    override fun run() {
    }

}
