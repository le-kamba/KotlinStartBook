package sample.chapter6

inline fun log(debug: Boolean = true, message: () -> String) {
    if (debug) {
        println(message())
    }
}

inline fun getCounter2(crossinline next: (Int) -> Int): () -> Int {
    var cnt: Int = 0
    return {
        cnt = next(cnt)
        cnt
    }
}

fun main(args: Array<String>) {
    log { "このメッセージは出力される" }
    log(false) { "このメッセージは出力されない" }

    println(getCounter2({ it + 4 })())
}