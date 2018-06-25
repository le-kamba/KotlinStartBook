package sample.chapter13

import kotlin.reflect.KProperty

class DMyClass {
    var _str: String? = null
    var str: String? by object {
        operator fun getValue(thisRef: DMyClass,
                              property: KProperty<*>): String? {
            println("${property.name}がgetされました")
            return _str
        }

        operator fun setValue(thisRef: DMyClass,
                              property: KProperty<*>, value: String?) {
            println("${property.name}に${value}がgetされました")
            _str = value
        }
    }
}

fun main(args: Array<String>) {

    val my = DMyClass()
    println(my.str)
    my.str = "ラーメン"
    println(my.str)
}