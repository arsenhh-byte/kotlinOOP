open class hospital( departmentName : String = "" ,  departmentAge : String = "" , departmentId : Int = 0 ) {
init {
    println("the department $departmentName is headed by dr $departmentAge and has the id  $departmentId  ")

}

}


class dental(departmentName: String ,departmentAge: String , departmentId: Int ) : hospital(departmentName,departmentAge,departmentId) {

    fun dent(){
        //incase of any text to be added for now i will leave it empty

    }

}
class surgery(departmentName: String, departmentAge: String, departmentId: Int) : hospital(departmentName,departmentAge,departmentId) {

fun surgical(){
    //incase of any text to be added for now i will leave it empty

}
}
class general(departmentName: String, departmentAge: String, departmentId: Int) : hospital(departmentName, departmentAge, departmentId) {

fun gen(){
    //incase of any text to be added for now i will leave it empty

}
}

fun main(){
    val hospital = hospital()
    val dental = dental("Dental", "Patel", 45454)
    val surgery = surgery("Surgical", "Ogutu", 68686)
    val general = general("General","Gaituri", 34343 )

}
