package sample.chapter6

fun foo(): Int {
    val a = 1
    val b = 2
    return a + b
}

fun bar(): Int {
    val c = 3
//    return a+c
    return c
}

fun getCounter(): () -> Int {
    var count = 0
    return {
        count++
    }
}

fun main(args: Array<String>) {
    val counter1 = getCounter()
    val counter2 = getCounter()
    println(counter1())
    println(counter1())
    println(counter2())
    println(counter1())
    println(counter2())

}