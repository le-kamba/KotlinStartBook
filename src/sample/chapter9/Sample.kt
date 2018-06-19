package sample.chapter9

open class Foo {
    private fun privateMethod(){}
    protected fun protectedMethod(){}
}

class Bar2: Foo() {
    fun execute(){
        protectedMethod()
//        privateMethod() // コンパイルエラー
    }
}

class Bax {
    fun execute(){
//        protectedMethod() // コンパイルエラー
    }
}

open class Hoge private constructor()
//class Fuga : Hoge() // コンパイルエラー
