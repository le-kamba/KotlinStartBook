package sample.chapter7

fun main(args: Array<String>) {
    val bucket = object {
        // バケツの容量
        val capacity: Int = 5

        // 入っている水の量
        var quantity: Int = 0

        // バケツを水で満たす
        fun fill() {
            quantity = capacity
        }

        // 排水する
        fun drainAway(){
            quantity = 0
        }

        // 入っている水の量を出力する
        fun printQuantity(){
            println(quantity)
        }
    }
    bucket.printQuantity() // 0
    bucket.fill()
    bucket.printQuantity() // 5
    bucket.drainAway()
    bucket.printQuantity() // 0
}