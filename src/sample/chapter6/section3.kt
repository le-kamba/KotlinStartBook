package sample.chapter6

fun firstK(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
            when {
                str.isEmpty() -> -1
                str.first() == 'K' -> index
                else -> go(str.drop(1), index + 1)
            }
    return go(str, 0)
}


fun firstUpperCase(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
            when {
                str.isEmpty() -> -1
                str.first().isUpperCase() -> index
                else -> go(str.drop(1), index + 1)
            }
    return go(str, 0)
}

fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
            when {
                str.isEmpty() -> -1
                predicate(str.first()) -> index
                else -> go(str.drop(1), index + 1)
            }
    return go(str, 0)
}

fun firstK2(str: String): Int {
    fun isK(c: Char): Boolean = c == 'K'
    return first(str, ::isK)
}

fun firstUpperCase2(str: String): Int {
    fun isUpperCase(c: Char): Boolean = c.isUpperCase()
    return first(str, ::isUpperCase)
}

fun main(args: Array<String>) {
    println(firstK(""))
    println(firstK("Keiko"))
    println(firstK("Start book for Kotlin"))

    println(firstUpperCase("callback Mr.Rock."))

    println()

    println(firstK2("Start book for Kotlin"))

    println(firstUpperCase2("callback Mr.Rock."))
}