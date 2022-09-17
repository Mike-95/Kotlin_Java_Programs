//Kotlin Programs

//#1 "Sum of two numbers"
fun sumOfTwoNumbers() {
    val a = 10
    val b = 30
    val c = a + b
    println(c)
}

//#2 "Swap two numbers"
fun swapTwoNumbers() {
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

//#3 "Sum of two numbers by receiving value from keyboard
fun sumOfTwoNumbersByReceivingValue() {
    println("Enter value a")
    var a = readLine()?.toInt()
    println("Enter value b")
    val b = readLine()?.toInt()
    val sum = b?.let { a?.plus(it) }
    println("Sum of value a and b is: $sum")
}

//#4 "Reverse number"
fun reverseNumber() {
    println("Enter any number to reverse!")
    var inputNumber = readLine()?.toInt()
    var reversed = 0
    while (inputNumber!! > 0) {
        val temp = inputNumber % 10
        reversed = reversed * 10 + temp
        inputNumber = inputNumber / 10
    }
    println(reversed)
}

//#5 "Arithmetic operators
fun arithmeticOperators() {
    //Addition
    println("Enter two values for addition")
    val additionA = readLine()?.toInt()
    val additionB = readLine()?.toInt()
    val addition = additionA!! + additionB!!
    println("Addition value of $additionA and $additionB is $addition")

    //Subtraction
    println("Enter two values for subtraction")
    val subtractionA = readLine()?.toInt()
    val subtractionB = readLine()?.toInt()
    val subtraction = subtractionA!! - subtractionB!!
    println("Subtraction value of $subtractionA and $subtractionB is $subtraction")

    //Multiplication
    println("Enter two values for multiplication")
    val multiplicationA = readLine()?.toInt()
    val multiplicationB = readLine()?.toInt()
    val multiplication = multiplicationA!! * multiplicationB!!
    println("Multiplication value of $multiplicationA and $multiplicationB is $multiplication")

    //Division
    println("Enter two values for division")
    val divisionA = readLine()?.toInt()
    val divisionB = readLine()?.toInt()
    val division = divisionA!! / divisionB!!
    println("Division value of $divisionA and $divisionB is $division")
}

//#5 "increment and decrement operator"
fun incrementAndDecrement() {
    var a = 10 //a->10
    var b = 20 //b->
    a++
    var k = ++a
    b--
    println("value of a is: $a; value of b is: $b; value of k is $k")
}

//#5 "Modulus operator"
fun modulusOperator() {
    //print even and odd numbers
    val listArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (i in listArray) {
        if (i % 2 != 0) {
            println("odd $i")
        } else {
            println("even $i")
        }
    }
}

// #6 "Factorial"
fun factorial() {
    var i = 1
    var fact = 1
    val number = 5
    while (i <= number) {
        fact = fact * i
        i++
    }
    println("Factorial of $number is $fact")

}

//#7 Fibonacci
fun fibonacci() {
    var n1 = 0
    var n2 = 1
    var n3: Int? = null
    var i = 2
    var count = 10

    print("$n1 $n2")
    while (i < count) {
        i++
        n3 = n1 + n2
        print(" " + n3)
        n1 = n2
        n2 = n3
    }
}

//#8 "Palindrome number"
fun palindromeNumber() {
    var r: Int? = null
    var sum = 0
    var temp: Int? = null
    println("Input any number!")
    var input: Int? = null
    input = readLine()?.toInt()
    temp = input

    if (input != null) {
        while (input > 0) {
            r = input % 10 //getting reminder
            sum = (sum * 10) + r
            input /= 10
        }
    }
    if (temp == sum) {
        println("Your input - $temp  is palindrome number ")
    } else {
        println("Your input - $temp is not palindrome number")
    }
}



