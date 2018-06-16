package sample.chapter5

fun sub(minuend:Int, subtrahend: Int): Int =
        minuend - subtrahend


fun main(args: Array<String>) {
    println(sub(5,3))
    println(sub(10,7))
    println(sub(subtrahend = 2, minuend = 6))

    fun hello(name: String="World"):String = "Hello $name!"
    println(hello())

    println(hello("Alice"))
}