fun main(){
val fruit1 = construct("apple","red","sweet" )
val fruit2 = construct("lemon", "green", "bitter")
    val fruit3 = construct()
    }



class construct (  fruit: String = "Kiwi" ,color : String= "Green" , taste: String = "Bittersweet" ) {
init {
    println("your favorite fruit is $fruit, it is $color in color and it has a $taste taste")
}
}