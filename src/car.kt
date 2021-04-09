class car {

    //7. Declare a class car with the data members brand and model ,
// then have member functions “ accelerate “ and ‘’ carColor “
// these two functions should print out how a certain brand of car will accelerate and what the color of the car is.

    var brand:String="Mercedes"
    var model:String="S class"


    fun accelarate(){
        println("350 CDI has 258PS power and 620NM Torque. S 500 has Power of 4600PS and Torque of 700NM." +
                " With such as fine combinations, " +
                "it can go from zero to 100kmph speed in 4.8 seconds in S 500 and same is achieved in 7.5 seconds in diesel engine ie 350CDI.")

    }
    fun carColor(){
        println("its a blue car ")
    }


}

fun main(){
    val obj = car()
    println("\"${obj.accelarate()},${obj.carColor()}a mercedes s class ")

}