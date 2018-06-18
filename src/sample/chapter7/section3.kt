package sample.chapter7

interface Bucket2{
    fun fill()
    fun drainAway()
    fun pourTo(that: Bucket2)

    val capacity: Int
    var quantity: Int
}

fun createBucket2(_capacity: Int): Bucket2 = object : Bucket2{

    override val capacity = _capacity
    override var quantity:Int = 0

    override fun fill(){
        quantity = capacity
    }

    override fun drainAway() {
        quantity = 0
    }

    override fun pourTo(that: Bucket2) {
        val thatVacuity = that.capacity - that.quantity
        if(quantity<=thatVacuity){
            that.quantity += quantity
            drainAway()
        }else{
            that.fill()
            quantity -= thatVacuity
        }
    }
}


fun main(args: Array<String>) {

    // 容量7のバケツを作る
    var bucket1 = createBucket2(7)

    // 容量4のバケツを作る
    var bucket2 = createBucket2(4)

    // バケツ1を満たす
    bucket1.fill()

    // 1から2へ可能な限り注ぐ
    bucket1.pourTo(bucket2)

    println(bucket1.quantity) // 3
    println(bucket2.quantity) // 4

}