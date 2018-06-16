package sample.section6

class Rational(val n: Int, val d: Int) {
    init {
        require(d != 0, { "denominator must not be zero!" })
    }

    override fun toString(): String = "$numerator/$denominator"

    private val g by lazy { gcd(Math.abs(n), Math.abs(d)) }
    val numerator: Int by lazy { n / g }
    val denominator: Int by lazy { d / g }

    private tailrec fun gcd(a: Int, b: Int): Int =
            if (b == 0) a
            else gcd(b, a % b)

    operator fun plus(that: Rational): Rational = Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator)


    operator fun plus(n: Int): Rational = Rational(
            numerator + denominator *n,
            denominator)
}

fun main(args: Array<String>) {
    println(Rational(1,4) + 1)
    println(Rational(1,1) + 2)
}