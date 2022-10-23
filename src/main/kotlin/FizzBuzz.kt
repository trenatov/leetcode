/**
 * https://leetcode.com/problems/fizz-buzz/
 */
class FizzBuzz : Problem {

    fun fizzBuzz(n: Int): List<String> {
        val answer = mutableListOf<String>()

        for (i in 1..n) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz")
            } else if (i % 3 == 0) {
                answer.add("Fizz")
            } else if (i % 5 == 0) {
                answer.add("Buzz")
            } else {
                answer.add(i.toString())
            }
        }

        return answer
    }

    override fun run() {
        println(fizzBuzz(15))
    }

}
