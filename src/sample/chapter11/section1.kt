package sample.chapter11

class Container(var value: Any)

class ContainerG<T>(var value: T)

fun main(args: Array<String>) {
    val intContainer = Container(123)
    val i:Int = intContainer.value as Int
    println("i=$i")
    val strContainer = Container("Hello")
    val s = strContainer.value as String
    println("s=${s.toUpperCase()}")

    println("----------")
    val intCon :ContainerG<Int> = ContainerG(123)
    val ii:Int = intCon.value
    println("ii=$ii")
    println(ii.toString())
    val strCon = ContainerG("Hello")
    println("strCon=${strCon.value.toUpperCase()}")

}