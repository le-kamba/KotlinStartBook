package sample.chapter5

class Counter{
    private var cnt = 0

    fun countUp(){
        cnt++
    }

    fun getCount(): Int = cnt
}

fun main(args: Array<String>) {

    val c = Counter()
    println(c.getCount())
    c.countUp()
    println(c.getCount())
}