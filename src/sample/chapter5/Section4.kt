package sample.chapter5


fun main(args: Array<String>) {
    fun sum(vararg ints:Int): Int{
        var sum=0
        for( i in ints){
            sum += i
        }
        return sum
    }

    println(sum(1,2,3))

    val ints = intArrayOf(2,3,4)
    println(sum(*ints))
}