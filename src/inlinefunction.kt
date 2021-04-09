fun main(){
    val avg = {num1: Int, num2: Int, num3: Int -> (num1 + num2 + num3)/3 }

    println(" the average is ${avg(60,70,80)}")
}