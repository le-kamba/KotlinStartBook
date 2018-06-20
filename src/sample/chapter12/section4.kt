package sample.chapter12

fun square(i: Int) : Int = i*i

//public inline fun <T,R> T.let(block: (T)->(R)): R = block(this)

fun main(args: Array<String>) {
    val a: Int? = 5
    val aInc:Int? =
            if(a!=null) a.inc()
            else null

    val aaInc: Int? = a?.inc()

    val aa: Int? = 5
    val aSquare = if(a!=null) square(a) else null

    val aaSquare = a?.let{ square(it)}
}