//1. Print Numbers 0 to 9 using Kotlin.

fun main () {
    println("printing 0 to 9")

    for (num in 0..9) {
        println(num)
    }


    //2.Declare a nullable String variable.

    val s: String? = null
    println(s?.isEmpty()==true)


    //3. Declare a nullable Long variable in Kotlin.

val number:Long?=747484




    //4. Compare two strings using an if..else statement and generate an output.


        val drink = "water"
    if (drink == "Milkshake"){
        println("2nd favorite drink")
  }else{
        println("Water is my favorite drink")
    }


//5. Make a console application that will allow me to enter a string text ,
// then write a function
// which will accept the string as an argument and check if the word
// contains the letter ‘a’ .


print("enter your desired letters/word")
var letter = readLine()

if (letter!!.contains("a")) {


    println("contains letter a")
} else{
    println("Does not contain letter a")
}


//6. Declare a lambda function

var jina = {name1: String, name2: String -> name1 + name2}
println("arsen + ogutu: ${jina("arsen","ogutu")}")


//8. Declare a Kotlin array.

var cols = arrayOf("red, orange, green, yellow, blue,")


//9. Get the count of characters in the word “ Kotlin “.



var text = "kotlin"

println("Character Length: ${text.length}")


//10. Print out hello world using a lambda function

val hello = {name1: String, name2: String -> name1 + name2}
println("hello + world: ${hello("hello","world")}")

}









