package sample.chapter4


fun main(args: Array<String>) {

    println("----4.1----\n")
    var count = 3
    while (count-- > 0) {
        println("Hello")
    }

    do {
        println("Hello")
        val next = Math.random() < 0.5
    } while (next)

    println("\n----4.2----\n")
    for (x in arrayOf(1, 2, 3)) {
        println(x)
    }

    val names = listOf("foo", "bar", "baz")
    for (name in names) {
        println(name)
    }

    println("\n")
    for (i in 1..10 step 2) {
        println(i)
    }

    println("\n")
    for (item in MyIterable()) {
        println(item)
    }

    println("\n")
    val nameList = listOf("foo", "bar", "baz")
    var barIndex = -1
    for (index in names.indices) {
        // "bar"が見つかったらループを抜ける
        if (names[index] == "bar") {
            barIndex = index
            break
        }
    }
    println(barIndex)

    println("\n")

    loop@ for (x in 1..10) {
        for (y in 1..10) {
            if (y == 5) {
                break@loop
            }
        }
    }
}

class MyIterator {
    operator fun hasNext(): Boolean = Math.random() < 0.5
    operator fun next(): String = "Hello"
}

class MyIterable {
    operator fun iterator() = MyIterator()
}
