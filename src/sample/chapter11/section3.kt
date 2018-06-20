package sample.chapter11

interface Hoge
interface Fuga
class Foo<T>
class Bar<T : Hoge>

interface Piyo: Hoge, Fuga

class Baz<T> where T : Hoge, T:Fuga

fun main(args: Array<String>) {
    Foo<Hoge>()
    Foo<Fuga>()

    Bar<Hoge>()
//    Bar<Fuga>() // Error

    Baz<Piyo>()
}