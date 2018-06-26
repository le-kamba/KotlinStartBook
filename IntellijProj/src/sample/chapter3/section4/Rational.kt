package sample.section4

class Rational(val n: Int, val d: Int) {
    init {
        require(d != 0, { "denominator must not be zero!" })
    }

    override fun toString(): String = "$numerator/$denominator"

    private val g = gcd(Math.abs(n), Math.abs(d))
    val numerator: Int = n / g
    val denominator: Int = d / g

    private tailrec fun gcd(a: Int, b: Int): Int =
            if (b == 0) a
            else gcd(b, a % b)
}

fun main(args: Array<String>) {
    val r1 = Rational(17, 17)
    println(r1)

    val r2 = Rational(55, 100)
    println(r2)

    val r3 = Rational(1234, 5678)
    println(r3)
}