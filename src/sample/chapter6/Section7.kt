package sample.chapter6

inline fun forEach(str: String, f: (Char) -> Unit) {
    for (c in str) {
        f(c)
    }
}

fun containsDigit(str: String): Boolean {
    forEach(str) {
        if (it.isDigit())
            return true
    }
    return false
}


fun containsDigit2(str: String): Boolean {
    var result = false
    forEach(str) here@{
        if (it.isDigit()) {
            result = true
            return@here
        }
    }
    return result
}


fun containsDigit3(str: String): Boolean {
    var result = false
    forEach(str) {
        if (it.isDigit()) {
            result = true
            return@forEach
        }
    }
    return result
}


fun main(args: Array<String>) {

    println(containsDigit("To day is 2018"))
    println(containsDigit("Start book for Kotlin"))

    println(containsDigit2("To day is 2018"))
    println(containsDigit3("Start book for Kotlin"))

}