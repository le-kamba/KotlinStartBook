package sample.chapter11


fun main(args: Array<String>) {
    val a: CContainer<*> = CContainer<Int>(5)
    val b: CContainer<*> = CContainer<String>("ABC")

//    a.value = 4 // error
    println(b.value)
}