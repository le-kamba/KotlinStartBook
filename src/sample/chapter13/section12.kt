package sample.chapter13

fun main(args: Array<String>) {
    println(5.inc())

    val method = Int::inc
    println(method)

    val m: Int.() -> Int = Int::inc
    println(123.m())

    val andObject: Int.(Int) -> Int = Int::and
    println(0b1010.andObject(0b0011))

    // ラムダ式バージョン
    println(listOf(1, 2, 3).map { it.inc() })

    // メソッドの関数オブジェクトバージョン
    println(listOf(1, 2, 3).map(Int::inc))

    val length: String.() -> Int = String::length
    println(listOf("java", "kotlin").map(length))

}