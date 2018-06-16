package sample.section5

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


}

fun main(args: Array<String>) {
//    println(Rational(1, 4).plus(Rational(1, 2)))
//    println(Rational(1, 3).plus(Rational(4, 7)))
    println(Rational(1, 2) + Rational(1, 5))
    println(Rational(1, 6) + Rational(1, 3) + Rational(1, 2))
}