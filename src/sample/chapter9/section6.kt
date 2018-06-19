package sample.chapter9

import sample.hoge.Foo
import sample.fuga.Baz as Beer

class Baz

class Bar{
    fun ddd(){
        Foo()
        sample.hoge.Foo()
        Beer()
    }
}

fun main(args: Array<String>) {
    val bar: Bar = Bar()
    bar.ddd()

    publicFunction()
    internalFunction()
//    privateFunction() // コンパイルエラー
}