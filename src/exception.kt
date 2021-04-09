// using any code logic throw an exception

fun main(){
    try {
        var num = 10/0
        println("Hey boy check your code")
        println(num)


    }catch (e:ArithmeticException){
        println("Sorry there is something wrong please check your code")
    }catch (e:Exception){
        println(e)
    }finally {
        println("In any case we got you")
    }
}