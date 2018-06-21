package sample.chapter13

class MMyInt(val value:Int){
    infix fun plus(that: MMyInt): MMyInt =
            MMyInt(value + that.value)
}

fun main(args: Array<String>) {

    println( (MMyInt(1) plus MMyInt(2)).value)

    println( 5 shl 2)
    println( 0b1010 ushr 1)
    println( true and false)

    println( true xor false)

    println( (1..10 step 3).toList())
    println( (100 downTo 0 step 20).toList() )
}