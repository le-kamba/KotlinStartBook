package sample.chapter13

interface Greeter{
    fun greet()
}

fun main(args: Array<String>) {
    val myObject = object{}
    println(myObject)

    val greeter = object {
        fun greet(){
            println("Hello")
        }
    }

    greeter.greet()

    val greeter2 = object : Greeter{
        override fun greet() {
            println("Hello")
        }
    }
    greeter2.greet()
}