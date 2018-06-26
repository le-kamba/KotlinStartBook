package sample.chapter9

open class Person2(open val name: String) {
    open fun introduceMyself() {
        println("I am $name")
    }
}

class Student2(override val name: String, val id: Long) : Person2(name) {
    override fun introduceMyself() {
        println("I am $name(id=$id)")
        println("--自己紹介ここから--")
        super.introduceMyself()
        println("--自己紹介ここまで--")
    }
}

fun main(args: Array<String>) {
    val student: Student2 = Student2("くみこ", 123)
    student.introduceMyself()
}