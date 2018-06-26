package sample.chapter11

//    fun <T> Any.instanceOf(): Boolean = this is T // Error
inline fun <reified T> Any.instanceOf(): Boolean = this is T

fun main(args: Array<String>) {
    println("String".instanceOf<String>())
    println((0.5).instanceOf<Int>())
    println(setOf('5').instanceOf<Set<Char>>())
}