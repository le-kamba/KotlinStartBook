package sample.chapter5

fun sum1(numbers: List<Long>): Long {
    var sum = 0L
    for (n in numbers) {
        sum += n
    }
    return sum
}

tailrec fun sum2(numbers: List<Long>, accumulator: Long = 0): Long =
        if (numbers.isEmpty()) accumulator
        else sum2(numbers.drop(1), accumulator + numbers.first())

fun main(args: Array<String>) {

    println(sum1(listOf(1, 2, 3)))
    println(sum2(listOf(1, 2, 3)))

    println(sum2((1L..123456).toList()))
}