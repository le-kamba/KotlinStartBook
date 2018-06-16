package sample.chapter4

fun main(args: Array<String>){
    if(true){
        println("Hello")
    }

    if( 5 in 1..10){
        println("wawa")
        println("hoho")
    }

    if(1+2<3){
        println("hoge")
    }

    val score = 50
    if(score>=60){
        println("合格!")
    }else{
        println("不合格")
    }

    val message = if (score>=60) "合格！" else "不合格"
    println(message)

    val x = if(true) {
        1
        2
    }else{
        3
    }
    println(x)

    val score2 = 75
    val grade =
        if(score2 >= 90) 'A'
        else if(score2 >= 80) 'B'
        else if(score2 >= 70) 'C'
        else if(score2 >= 60) 'D'
        else 'F'
    println(grade)

    val grade2 = when{
        score2>=90 -> 'A'
        score2 >= 80 -> 'B'
        score2 >= 70 -> 'C'
        score2 >= 60 -> 'D'
        else -> 'F'
    }
    println(grade2)
}