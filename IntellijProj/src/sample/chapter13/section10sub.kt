package sample.chapter13


//class Hoge:MyList2<Any>() // error

sealed class DrinkSizeType {
    object Small : DrinkSizeType()
    object Medium : DrinkSizeType()
    object Large : DrinkSizeType()
}

enum class DrinkSize {
    SMALL,
    MEDIUM,
    LARGE,
}

enum class DrinkSizeN(val milliliter: Int) {
    SMALL(300),
    MEDIUM(350),
    LARGE(500),
}


enum class DrinkSizeS(val milliliter: Int) {
    SMALL(300) {
        override fun message() = "少ないよ！"
    },
    MEDIUM(350) {
        override fun message() = "無難な選択だ"
    },
    LARGE(500) {
        override fun message() = "さすがに飲み過ぎだ"
    };

    abstract fun message(): String
}

fun main(args: Array<String>) {

    fun headString(list: MyList2<*>): String =
            when (list) {
                is MyList2.Cons<*> -> list.head.toString()
                is MyList2.Nil -> "要素無し"
            }

    println(headString(MyList2.Cons("foo", MyList2.Nil)))
    println(MyList2.Nil)

    val myFavoriteSize = DrinkSizeType.Large
    println(myFavoriteSize)

    val favoriteSize = DrinkSize.LARGE
    println(favoriteSize)

    println(DrinkSizeN.SMALL.milliliter)

    println(DrinkSizeS.MEDIUM.message())

    val types = DrinkSizeS.values()
    println(types.toList())

    println(DrinkSizeS.valueOf("LARGE"))
//    println(DrinkSizeS.valueOf("EXTRA_LARGE")) // 実行時エラー
//    println(DrinkSizeS.Companion.valueOf("EXTRA_LARGE")) // ERROR

    println(DrinkSizeS.SMALL.name)
    println(DrinkSizeS.values().map { type -> type.ordinal })

}