package coderun

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


/*
	Для чтения входных данных необходимо получить их
	из стандартного потока ввода (System.in).
	Данные во входном потоке соответствуют описанному
	в условии формату. Обычно входные данные состоят
	из нескольких строк. Можно использовать более производительные
	и удобные классы BufferedReader, BufferedWriter, Scanner, PrintWriter.

	С помощью BufferedReader можно прочитать из стандартного потока:
	* строку -- reader.readLine()
	* число -- val n = reader.readLine().toInt();
	* массив чисел известной длины (во входном потоке каждое число на новой строке) --
	val nums = arrayOfNulls<Int>(len)
	for (i in 0 until len) {
		nums[i] = reader.readLine().toInt()
	}

	* последовательность слов в строке --
	val parts = reader.readLine().split(" ")

	Чтобы вывести результат в стандартный поток вывода (System.out),
	Через BufferedWriter можно использовать методы
	writer.write("Строка"), writer.write('A') и writer.newLine().

	Возможное решение задачи "Вычислите сумму чисел в строке":
	var sum = 0
	val parts = reader.readLine().split(" ")
	for (i in 0 until parts.length) {
		val num = parts[i].toInt()
		sum += num
	}
	writer.write(sum.toString())
*/
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val values = reader.readLine().split(" ")
    var count = 0
    val map = mutableMapOf<String, Int>()

    for (v in values) {
        val appears = map.getOrDefault(v, 0)
        if (appears == 1) {
            count--
            map[v] = appears + 1
        } else if (appears == 0) {
            count++
            map[v] = 1
        } else {
            map[v] = appears + 1
        }
    }

    writer.write(count.toString())

    reader.close()
    writer.close()
}
