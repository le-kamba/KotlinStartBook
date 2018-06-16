package sample.chapter3.section3

class Rational(val numerator: Int, val denominator: Int){
    init{
        require(denominator!=0, {"denominator must not be zero!"})
    }
    override fun toString(): String = "$numerator/$denominator"
}

fun main(args: Array<String>){
    val half = Rational(1, 0)
    println(half.denominator)
    println(half)

}