package sample.chapter4

fun main(args: Array<String>) {

    // 2.1
    println("----2.1-----")
    val name = "Hanako"
    println("Hello, $name!")

    println("""
        Hello, $name!
""")

    println("""
        |It's
        |sunny
        |today.
        """.trimMargin())

    // 2.2
    println("\n----2.2-----")
    val ints = arrayOfNulls<Int>(5)
    println(ints.size)
    println(ints[0])

    ints[0] = 123
    println(ints[0])

    val strs = arrayOf("red", "green", "blue")
    println(strs[0])

    val ints2 = intArrayOf(1, 2, 3)
    println(ints2[0])

    val chars = charArrayOf('a', 'b')
    println("${chars[0]}, ${chars[1]}")

    // 2.3
    println("\n----2.3-----")
    val intlist = listOf(1, 2, 3)
    println(intlist)
    println(intlist.size)
    println(intlist[0])

//    intlist[2] = 5 // コンパイルエラー

    val charsList: MutableList<Char> = mutableListOf('a', 'b')
    println(charsList)

    charsList[0] = 'c'
    println(charsList)

    charsList += 'X'
    println(charsList)

    charsList -= 'X'
    println(charsList)

    charsList.removeAt(0)
    println(charsList)

    // 2.4
    println("\n----2.4---")
    val intSet: Set<Int> = setOf(1, 2, 3)
    println(intSet)

    val charSet: MutableSet<Char> = mutableSetOf('a', 'a', 'b')
    println(charSet)

    charSet -= 'a'
    println(charSet)

    // 2.5
    println("\n----2.5---")
    val numberMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
    println(numberMap)
    println(numberMap.size)
    println(numberMap["one"])
    println(numberMap["three"])

    numberMap += "three" to 3
    println(numberMap)

    // 2.6
    println("\n----2.6---")
    println(5 in 1..10)

    val range: IntRange = 12..15
    println(5 in range)
    println(5 !in range)

    println((1..5).toList())
    println((1..5).reversed().toList())

    println((5 downTo 1).toList())

    println((1..5 step 2).toList())
    println((100 downTo 0 step 25).toList())

}

