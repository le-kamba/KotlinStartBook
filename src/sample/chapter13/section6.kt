package sample.chapter13

data class UUser(val id: Id, val name: String) {
    data class Id(val value: Long)
}

data class Auser(val id: Long, val name: String) {
    inner class Action {
        fun show(): String = "$name($id)"
    }
}

fun main(args: Array<String>) {
    val user1 = User(1, "Taro")
    val user2 = User(1, "Taro")
    val user3 = User(2, "Hanako")

    println(user1 == user2)
    println(user3)

    val taro = User(1, "Taro")
    println(taro)

    val newTaro = taro.copy(id = 112233)
    println(newTaro)
    println(taro)

    val (id, name) = User(1, "Taro")
    println(id)
    println(name)

    println("-------------")

    val iid: UUser.Id = UUser.Id(123)
    println(UUser(iid, "Taro"))

    println("-------------")

    val user = Auser(123, "Taro")
    val action: Auser.Action = user.Action()
    println(action.show())
}