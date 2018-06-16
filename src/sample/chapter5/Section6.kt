package sample.chapter5


fun sum3(numbers: List<Long>): Long {

    tailrec fun go(numbers: List<Long>, accumulator: Long): Long =
            if (numbers.isEmpty()) accumulator
            else go(numbers.drop(1), accumulator + numbers.first())

    return go(numbers, 0)
}

fun main(args: Array<String>) {

    println(sum3((1L..123456).toList()))
}