package sample.chapter5

fun succ(i: Int) = i + 1

fun square(i: Int): Int = i * i

fun hello(name: String) = "Hello, $name!"

fun main(args: Array<String>) {
    val result = succ(31)
    println(result)
    println(succ(9))

    println(square(5))


    println(hello("Alice"))

    println()

    fun max(a: Int, b: Int): Int = if (b <= a) a else b
    println(max(12, 13))
    println(max(0, -1))
}