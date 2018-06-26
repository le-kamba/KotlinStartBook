package sample.chapter7

class BucketImpl(_capacity: Int) : Bucket2{
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

    val buket1: Bucket2 = BucketImpl(7)
    val buket2: Bucket2 = BucketImpl(4)

    buket1.fill()
    buket1.pourTo(buket2)

    println(buket1.quantity)
    println(buket2.quantity)
}