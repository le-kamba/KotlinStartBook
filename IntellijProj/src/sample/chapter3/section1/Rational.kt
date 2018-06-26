package sample.chapter3.section1

class Rational(val numerator: Int, val denominator: Int)

fun main(args: Array<String>) {
    val half = Rational(1, 2)
    println(half.denominator)
    println(half)
}