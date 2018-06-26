package sample.chapter8

class Person {
    var name: String = ""
        set(value) {
            println("${value}がセットされました")
            field = value
        }
    var age: Int = 0
    val nameLength: Int
        get(): Int{
            return this.name.length
        }
    val nameLen: Int
        get() = name.length
}

class MyClass2 {
    lateinit var foo:String
}

fun main(args: Array<String>) {
    val hanako = Person()

    hanako.name = "はなこ"

    println(hanako.nameLength)
    println(hanako.nameLen)
    println(hanako.name)

    val m2 = MyClass2()
//    println(m2.foo)

    m2.foo = "bar"
    println(m2.foo)
}