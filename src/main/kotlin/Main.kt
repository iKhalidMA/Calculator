import java.lang.ArithmeticException

fun main(args: Array<String>) {




try {
    var number1: Int
    var number2: Int
    var operation: Char

    println("Please Enter the first number:")
    number1 = readln()!!.toInt()
    println("Please Enter the second number:")
    number2 = readln()!!.toInt()
    println("Please Enter the operation (* or / or + or - or % )")
    operation = readln()!!.single()

    when (operation){
        '*' -> multi(number1,number2)
        '+' -> add(number1,number2)
        '-' -> sub(number1,number2)
        '%' -> modulus(number1,number2)
        '/' -> division(number1,number2)

    }


}catch (exception: Exception){
    println("Where is your operation ")

 }
}



    fun add (num1 : Int, num2: Int){
        println("$num1 + $num2 = ${num1+ num2}" )
    }
    fun sub (num1 : Int, num2: Int){
        println("$num1 - $num2 = ${num1 -  num2}" )
    }
    fun multi  (num1 : Int, num2: Int){
        println("$num1 * $num2 = ${num1 *  num2}" )
    }
    fun  modulus (num1 : Int, num2: Int){
        println("$num1 % $num2 = ${num1 %  num2}" )
    }
    fun  division (num1 : Int, num2: Int){
        try {
            println("$num1 / $num2 = ${num1 / num2}" )
        }
        catch (exception : ArithmeticException){
            print("Math Error ")
        }
    }