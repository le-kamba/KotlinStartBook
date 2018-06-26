package sample.chapter10

interface Greeteror {
    fun sayHello(target: String)
    fun sayHello()
}

open class JapaneseGreeteror : Greeteror {
    override fun sayHello(target: String) {
        println("こんにちは、${target}さん！")
    }

    override fun sayHello() {
        sayHello("匿名")
    }
}

class JapaneseGreeterWithRecording : JapaneseGreeteror() {
    private val _targets: MutableSet<String> = mutableSetOf()

    val targets: Set<String>
        get() = _targets

    override fun sayHello(target: String) {
        _targets += target
        super.sayHello(target)
    }
}

class JapaneseGreeterWithRecordingDelegating : Greeteror {
    private val greeteror: Greeteror = JapaneseGreeteror()

    private val _targets: MutableSet<String> = mutableSetOf()

    val targets: Set<String>
        get() = _targets

    override fun sayHello() {
        greeteror.sayHello()
    }

    override fun sayHello(target: String) {
        _targets += target
        greeteror.sayHello(target)
    }
}

class GreeterWithRecording(private val greeteror: Greeteror) : Greeteror by greeteror {
    private val _targets: MutableSet<String> = mutableSetOf()

    val targets: Set<String>
        get() = _targets

    override fun sayHello(target: String) {
        _targets += target
        greeteror.sayHello(target)
    }
}

fun main(args: Array<String>) {
    val greeter = JapaneseGreeteror()
    greeter.sayHello()
    greeter.sayHello("たろう")

    println("--------------")
    val recordGreeter = JapaneseGreeterWithRecording()
    recordGreeter.sayHello("うらがみ")
    recordGreeter.sayHello("がくぞ")

    println(recordGreeter.targets)

    println("--------------")
    recordGreeter.sayHello("***")
    recordGreeter.sayHello()
    println(recordGreeter.targets)

    println("--------------")
    val recordGreeter2 = JapaneseGreeterWithRecordingDelegating()
    recordGreeter2.sayHello()
    recordGreeter2.sayHello("たろう")
    println(recordGreeter2.targets)

    println("--------------")
    val japanese = JapaneseGreeteror()
    val g = GreeterWithRecording(japanese)
    g.sayHello()
    g.sayHello("委譲")
    println(g.targets)

}