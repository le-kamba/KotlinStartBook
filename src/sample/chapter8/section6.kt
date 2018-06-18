package sample.chapter8

fun countWords(s: String): Int =
    s.split("""\s+""".toRegex()).size

fun String.countWords2(): Int =
        this.split("""\s+""".toRegex()).size

val String.wordsCount: Int
    get() = split("""\s+""".toRegex()).size

fun main(args: Array<String>) {

    println(countWords("I like  Kotlin"))
    println("I like     Kotlin".countWords2())
    println("I like     Kotlin".wordsCount)

}