package sample.chapter10

interface Greeter {
    val language: String
    fun sayHello(target: String)
}

class EnglishGreeter : Greeter {
    override val language = "English"
    override fun sayHello(target: String) {
        println("Hello, $target!")
    }
}

open class SuperClass

interface Foo
interface Bar

class MyClass : SuperClass(), Foo, Bar

fun main(args: Array<String>) {
    val greeter = EnglishGreeter()
    greeter.sayHello("Kotlin")

    val myClass = MyClass()
}