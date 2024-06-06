//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    println(factorial(10))
    println("--------------------------------------------")
//2
    println(degree(5))
    println("--------------------------------------------")
//3
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val operation: (Array<Int>) -> Array<Int> = :: simpleFunction
    val resultArray = operation(array)
    for (i in resultArray){
        print("$i ")
    }
}

fun factorial(number: Int) : Int{
    if (number == 0 || number == 1) return 1
    return number * factorial(number - 1)
}

fun degree(number: Int): Int{
    if (number == 0) return 1
    return 10 * degree(number - 1)
}

fun simpleFunction(array: Array<Int>): Array<Int>{
    for (i in array.indices){
        if (i % 2 == 0) array[i] += 1
    }
    return array
}