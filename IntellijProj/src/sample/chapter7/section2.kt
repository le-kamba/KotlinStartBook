package sample.chapter7

interface Bucket{
    fun fill()
    fun drainAway()
    fun pourTo(that: Bucket)

    fun getCapacity():Int
    fun getQuantity():Int
    fun setQuantity(quantity: Int)
}

fun createBucket(capacity: Int): Bucket = object : Bucket{
    var _quantity: Int = 0
    override fun fill(){
        setQuantity(getCapacity())
    }

    override fun drainAway() {
        setQuantity(0)
    }

    override fun pourTo(that: Bucket) {
        val thatVacuity = that.getCapacity()-that.getQuantity()
        if(getQuantity()<=thatVacuity){
            that.setQuantity(that.getQuantity()+getQuantity())
            drainAway()
        }else{
            that.fill()
            setQuantity(getQuantity()-thatVacuity)
        }
    }

    override fun getCapacity(): Int = capacity
    override fun getQuantity(): Int = _quantity

    override fun setQuantity(quantity: Int) {
        _quantity = quantity
    }
}


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

        // 別のバケツに注ぐ
        fun pourTo(that: Bucket){

        }
    }
    bucket.printQuantity() // 0
    bucket.fill()
    bucket.printQuantity() // 5
    bucket.drainAway()
    bucket.printQuantity() // 0

    println("-----------------")

    // 容量7のバケツを作る
    var bucket1 = createBucket(7)

    // 容量4のバケツを作る
    var bucket2 = createBucket(4)

    // バケツ1を満たす
    bucket1.fill()

    // 1から2へ可能な限り注ぐ
    bucket1.pourTo(bucket2)

    println(bucket1.getQuantity()) // 3
    println(bucket2.getQuantity()) // 4

}