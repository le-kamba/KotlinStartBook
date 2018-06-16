package sample.chapter5

fun sum(ints: Array<Int>): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

fun main(args: Array<String>) {
    println(sum(arrayOf(1, 2, 3)))
}