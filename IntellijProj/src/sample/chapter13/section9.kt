package sample.chapter13

class Uesr(val id: Long, val name: String) {
    companion object Pool {
        val DUMMY = User(0, "dummy")
    }
}

class Uesr2(val id: Long, val name: String) {
    companion object {
        val DUMMY = User(0, "dummy")
    }
}

fun main(args: Array<String>) {
    val dummy = Uesr.Pool.DUMMY
    println("${dummy.id}. ${dummy.name}")
    println(Uesr.DUMMY.name)

    println(Uesr2.DUMMY.name)
    println(Uesr2.Companion.DUMMY === Uesr2.DUMMY)
}