package sample.chapter13

interface Greeter2 {
    fun greet(name: String)
}

object JapaneseGreeter : Greeter2 {
    override fun greet(name: String) {
        println("こんにちは、${name}さん！")
    }
}

fun main(args: Array<String>) {

    JapaneseGreeter.greet("たろう")

    val greeter2: JapaneseGreeter = JapaneseGreeter
    greeter2.greet("じろう")
}