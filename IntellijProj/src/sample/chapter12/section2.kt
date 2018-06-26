package sample.chapter12

fun main(args: Array<String>) {
//    val s:String = null // error
    val s:String? = null // OK
    println(s)

//    s.toUpperCase() // NG
    println(s?.toUpperCase()) // OK
}