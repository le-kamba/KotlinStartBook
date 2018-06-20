package sample.chapter12

fun main(args: Array<String>) {
    val a: String? = null
    val b: String? = "Hello"
    if(a!=null){
        println(a.toUpperCase())
    }
    if(b!=null){
        println(b.toUpperCase())
    }

    val list: List<Any> = listOf(1, 'a', false)
    for(e in list){
        val result: Any? = when(e){
            is Int -> e+5
            is Char -> e.toUpperCase()
            is Boolean -> e.not()
            else -> null
        }
        println(result)
    }
}