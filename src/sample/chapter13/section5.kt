package sample.chapter13

data class User(val id: Long, val name: String)

fun main(args: Array<String>) {
    val user1 = User(1, "Taro")
    val user2 = User(1, "Taro")
    val user3 = User(2, "Hanako")

    println( user1== user2)
    println( user3 )

    val taro = User(1, "Taro")
    println(taro)

    val newTaro = taro.copy(id=112233)
    println(newTaro)
    println(taro)

    val (id, name) = User(1, "Taro")
    println(id)
    println(name)
}