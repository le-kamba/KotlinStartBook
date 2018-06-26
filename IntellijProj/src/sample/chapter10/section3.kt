package sample.chapter10

interface Goo {
    fun aaa()
    fun bbb()
}

interface Gar : Goo {
    override fun aaa() {}
    fun ccc()
}

class Gaz : Gar {
    override fun bbb() {}
    override fun ccc() {}
}

fun main(args: Array<String>) {
    val gaz = Gaz()
}