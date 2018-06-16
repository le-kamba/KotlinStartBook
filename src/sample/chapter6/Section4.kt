package sample.chapter6

fun firstWhitespace(str: String): Int {
    val isWhitespace: (c: Char) -> Boolean = {
        it.isWhitespace()
    }
    return first(str, isWhitespace)
}

fun firstWhitespace2(str: String): Int =
        first(str, { it.isWhitespace() })

fun firstWhitespace3(str: String): Int =
        first(str) { it.isWhitespace() }

fun main(args: Array<String>) {

    val square: (Int) -> Int = { i: Int ->
        i * i
    }

    println(square(5))

    val square1 = { i: Int ->
        i * i
    }

    val square2: (Int) -> Int = { i ->
        i * i
    }


    val square3: (Int) -> Int = {
        it * it
    }

    println(square1(5))
    println(square2(5))
    println(square3(15))

    println(firstWhitespace("Start book for Kotlin"))

    println(firstWhitespace2("Start book for Kotlin"))
    println(firstWhitespace3("Start book for Kotlin"))
}