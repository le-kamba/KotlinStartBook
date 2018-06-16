package sample.chapter6

fun square(i: Int): Int = i * i

fun main(args: Array<String>) {
    println(::square)

    val functionObj: (Int) -> Int = ::square
    println(functionObj(5))
}