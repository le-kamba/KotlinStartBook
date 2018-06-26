package sample.chapter10

interface Foo2 {
    fun execute()
}

interface Bar2 {
    fun execute()
}

class FooBar : Foo2, Bar2 {
    override fun execute() {
        println("FooBar")
    }
}

open class Superclasss {
    open fun execute() {
        println("Superclass")
    }
}

class FooSubClass : Superclasss(), Foo2

interface Hoge {
    fun execute() {
        println("Hoge")
    }
}

interface Fuga {
    fun execute() {
        println("Fuga")
    }
}

class HogeFuga : Hoge, Fuga {
    override fun execute() {
        super<Hoge>.execute()
    }
}

fun main(args: Array<String>) {

    val fooSubClass = FooSubClass()
    fooSubClass.execute()

    val hogeFuga = HogeFuga()
    hogeFuga.execute()
}