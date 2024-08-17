//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    val printCount = {count:Int, str:String -> for (i in 1..count) println(str)}
    printCount(3, "Привет")

    println("\nЗадание 2")
    val srNumber = {numbers:Array<Int> ->
        var result = 0.0
        for (i in numbers) {
            result += i
        }
        result /= numbers.size
        result
    }
    val res = srNumber(arrayOf(5,2,3))
    println("Среднее арифметическое $res")

    println("\nЗадание 3")
    val filterNumber = {numbers:Array<Int> ->
        val numbersTwo = ArrayList<Int>()
        for (i in numbers) if (i >= 0) numbersTwo.add(i)
        numbersTwo.toArray()
    }
    val numbers = filterNumber(arrayOf((-15..15).random(),(-15..15).random(),(-15..15).random(),(-15..15).random(),(-15..15).random()))
    for (i in numbers) print("$i ")
    println()

    println("\nЗадание 4")
    val opNumber = {arr:Array<Int> ->
        val numbersTwo = ArrayList<Int>()
        for (i in arr) {
            print("$i ")
            if (i % 2 == 0) numbersTwo.add(i / 2)
            else numbersTwo.add(i * 3)
        }
        println()
        numbersTwo
    }
    val arr = opNumber(arrayOf((1..15).random(),(1..15).random(),(1..15).random(),(1..15).random(),(1..15).random()))
    for (i in arr) print("$i ")
}