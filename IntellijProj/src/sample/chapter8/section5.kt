package sample.chapter8

class Rational constructor(n: Int, d: Int){
    val numerator: Int = n
    val denominator: Int = d
}
class Rational2 (val numerator: Int, val denominator: Int){
    constructor(numerator: Int) : this(numerator, 1)
}

class Rational3 (val numerator: Int, val denominator: Int = 1){
    init {
        require(denominator!=0)
    }
}

fun main(args: Array<String>) {
    val half = Rational(1,2)
    println(half.numerator)
    println(half.denominator)

    val quarter = Rational2(1,4)
    println("${quarter.numerator}/${quarter.denominator}")

    val five = Rational2(5)
    println("${five.numerator}/${five.denominator}")

    Rational3(1,1)
    Rational3(1,0)
}