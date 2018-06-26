package sample.chapter11

fun show(container: ContainerG<Any>){
    println(container.toString())
    println(container.hashCode())
    println(container.value)
}

fun sshow(container: ContainerG<out Any>){
    println(container.toString())
    println(container.hashCode())
    println(container.value)
}

fun <T> ContainerG<T>.copyTo(to: ContainerG<in T>){
    to. value = value
}

class CContainer<out T>(val value:T)

fun show2(container: CContainer<Any>){
    println(container.toString())
    println(container.hashCode())
    println(container.value)
}

fun main(args: Array<String>) {
    val a: ContainerG<String> = ContainerG("Hello")
//    val b: ContainerG<CharSequence> = a // error

    sshow(a)

    val b: ContainerG<out Any> = a
//    b.value = 123 // error

    val aa:ContainerG<Int> = ContainerG(15)
    val bb: ContainerG<Number> = ContainerG(0)
    println("bb=${bb.value}")
    aa.copyTo(bb)
    println("bb=${bb.value}")

    val c = CContainer(10)
    show2(c)
}