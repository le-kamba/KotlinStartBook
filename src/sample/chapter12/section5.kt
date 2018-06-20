package sample.chapter12

fun main(args: Array<String>) {
    var foo:String? = "Hello"
    var bar:String = foo!!

    println(bar.toUpperCase())

    val hoge:String?=null
//    val fuga: String = hoge!!

    val bbar: String = requireNotNull(foo, {"nullなわけがない"})

    println(bbar.toUpperCase())

    val ffuga: String = requireNotNull(hoge, {"hogeはnullであってはダメ"})
}