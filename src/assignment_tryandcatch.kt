// using the try and catch block as an expression, allow me to enter an age in the console,
//if the age us greater than 18 "i can drink beer" if the age is less than 18 "i only drink soda"

fun main(){

print("enter your age:")
val age = Integer.valueOf(readLine())

    try {
        if (age >= 18){
            throw Exception("I can drink beer")
        }
        else{
            println("I only drink soda")
        }
    }catch (e:Exception){
        println(e.message)
    }

}