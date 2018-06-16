package sample.section7

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

operator fun Int.plus(r: Rational) = r + this

fun main(args: Array<String>) {
    println(3 + Rational(2,1) )
    println(1 + Rational(1,2) +2 )
}