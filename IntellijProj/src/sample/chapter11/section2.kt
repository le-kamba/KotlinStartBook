package sample.chapter11

fun <T> box(value: T):ContainerG<T> = ContainerG(value)

val <T> T.string: String
    get() = toString()

fun main(args: Array<String>) {

    val container: ContainerG<Int> = box(5)
    println(container.string)
}