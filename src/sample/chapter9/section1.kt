package sample.chapter9

open class Person(val name:String){
    fun introduceMyself(){
        println("I am $name")
    }
}

class Student(name: String, val id:Long):Person(name)

fun main(args: Array<String>) {
    val person: Person = Person("ゆたか")
    person.introduceMyself()

    val student: Student = Student("くみこ", 123)
    println(student.name)
    student.introduceMyself()
}