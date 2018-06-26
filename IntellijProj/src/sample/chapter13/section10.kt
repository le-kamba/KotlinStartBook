package sample.chapter13

interface MyList<out T>

object Nil : MyList<Nothing> {
    override fun toString(): String = "Nil"
}

class Cons<T>(val head: T, val tail: MyList<T>) : MyList<T> {
    override fun toString(): String = "$head:$tail"
}

sealed class MyList2<out T> {
    object Nil : MyList2<Nothing>() {
        override fun toString(): String = "Nil"
    }

    class Cons<T>(val head: T, val tail: MyList2<T>) : MyList2<T>() {
        override fun toString() = "$head:$tail"
    }
}

fun main(args: Array<String>) {
    val v = Cons("foo", Cons("bar", Cons("baz", Nil)))
    println(v)

    fun headString(list: MyList<*>): String =
            when (list) {
                is Cons<*> -> list.head.toString()
                else -> "要素無し"
            }

    println(headString(Cons("foo", Nil)))
    println(headString(Nil))

}