package sample.chapter13

class MyIInt(val value:Int){
    override fun equals(other: Any?): Boolean =
            if (other is MyIInt) value==other.value
    else false
}


fun main(args: Array<String>) {
    val a = setOf(1)
    val b = a
    println(b===a) // true
    println(b==a) // true

    println(a === setOf(1)) // false
    println(b !== setOf(1))  // true

    println(a === null)  // false
    println(a==null) // false
    println(null===null) // true

    println("-------------")
    val i: Int? = 127
    println(i===127) // true
    val j: Int? = 128
    println(j === 128)

    println("-------------")
    println(MyIInt(2) == MyIInt(2)) // true
    println(MyIInt(1) == MyIInt(3)) // false
    println(MyIInt(1) != MyIInt(3)) // true
}