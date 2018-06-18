package sample.chapter6


fun main(args: Array<String>) {

    val square1: (Int) -> Int = { i: Int ->
        i * i
    }

    val square2: (Int) -> Int = fun(i: Int): Int {
        return i * i
    }

    val square3: (Int) -> Int = fun(i: Int) = i * i

    println(square1(5))
    println(square2(6))
    println(square3(7))
}