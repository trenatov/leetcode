package array

import Problem
import java.util.*


/**
 * https://leetcode.com/problems/asteroid-collision/
 */
class AsteroidCollision : Problem {

    fun asteroidCollision(asteroids: IntArray): IntArray {
        if (asteroids.size <= 1) return asteroids
        val stack = Stack<Int>().apply {
            push(asteroids[0])
        }

        for (i in 1..asteroids.lastIndex) {
            collide(stack, asteroids[i])
        }

        return stack.toIntArray()
    }

    private fun collide(stack: Stack<Int>, current: Int) {
        if (stack.isEmpty()) {
            stack.push(current)
            return
        }

        val prev = stack.pop()

        if ((prev < 0 && current < 0) || (prev > 0 && current > 0) || prev < 0 && current > 0) {
            stack.push(prev)
            stack.push(current)
            return
        }

        if (Math.abs(prev) > Math.abs(current)) {
            stack.push(prev)
        } else if (Math.abs(prev) < Math.abs(current)) {
            collide(stack, current)
        }
    }

    override fun run() {
        println(asteroidCollision(intArrayOf(5, 10, -5)).toList())
        println(asteroidCollision(intArrayOf(8, -8)).toList())
        println(asteroidCollision(intArrayOf(10, 2, -5)).toList())
        println(asteroidCollision(intArrayOf(1, 3, 2, -5)).toList())
        println(asteroidCollision(intArrayOf(-2, -1, 1, 2)).toList())
    }

}
