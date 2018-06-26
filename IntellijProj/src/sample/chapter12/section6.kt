package sample.chapter12

fun main(args: Array<String>) {

    val foo: String? = "Hello"
    println((if(foo!=null) foo else "default").toUpperCase())

    val hoge: String? = null
    println((if(hoge!=null) hoge else "default"))

    println((foo ?: "default").toUpperCase())
    println(hoge ?: "default")

    println(foo ?: throw AssertionError())

    println(hoge ?: throw AssertionError())

}