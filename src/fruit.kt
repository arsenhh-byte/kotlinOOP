class fruit {
    var color:String="red"
    var taste:String="sweet"
    var apple:String="Apple"
    var lemon:String="Lemon"
    var taste2:String="bitter"
    var color2:String="Green"


    fun fruitcolor (){
        println("your favorite fruit is "  +  color +  apple)


    }

    fun tastefruit(){
        println("or it might be " + taste2  +  lemon )
    }

}


fun main(){
    val obj = fruit()
    println("${obj.fruitcolor()},${obj.tastefruit()}")
}