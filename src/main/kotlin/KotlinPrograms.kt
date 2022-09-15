
//Kotlin Programs

//#1 "Sum of two numbers"
fun sumOfTwoNumbers(){
    val a = 10
    val b = 30
    val c = a+b
    println(c)
}

//#2 "Swap two numbers"
fun swapTwoNumbers(){
    println("Enter a value!")
    var a = readLine()?.toInt() //10
    println("Enter b value!")
    var b = readLine()?.toInt() //20
    var temp = a //temp 10
    a = b // a 20
    b = temp // b 10
    println("Value of a is $temp; Value of b is $a")
    println("After swaping, Value of a is $a; Value of b is $temp")

}