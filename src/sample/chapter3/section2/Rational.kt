package sample.chapter3.section2

class Rational(val numerator: Int, val denominator: Int) {
    override fun toString(): String = "$numerator/$denominator"
}

fun main(args: Array<String>) {
    val half = Rational(1, 2)
    println(half.denominator)
    println(half)

    val h2 = Rational(3, 5)
    println(h2)
}