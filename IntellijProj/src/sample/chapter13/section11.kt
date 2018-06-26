package sample.chapter13

class MyException(message: String) : Exception(message)

fun main(args: Array<String>) {
//    throw MyException("例外だよ")

    try {
        println(1)
    } catch (e: Exception) {
        println(2)
    } finally {
        println(3)
    }

    try {
        println(1 / 0)
    } catch (e: Exception) {
        println(2)
    } finally {
        println(3)
    }

    try {
        println("123".toInt())
    } catch (e: Exception) {
        null
    } finally {
        println("finally")
    }

    println(
            try {
                "ONE".toInt()
            } catch (e: Exception) {
                null
            } finally {
                println("finally")
            }
    )

    fun throwException() {
        throw Exception("これはチェック例外です")
    }

//    throwException() //try-catchしてなくても怒られない
}