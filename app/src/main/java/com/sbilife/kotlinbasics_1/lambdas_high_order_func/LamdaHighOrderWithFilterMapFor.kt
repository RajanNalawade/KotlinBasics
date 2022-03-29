fun main() {
    //Collection functions
    //.forEach() -
    //.map() - map this data to another form (converts one form of data in to another form)
    //.filter() - filters given collection

    val nums = listOf<Int>(1,2,3,4,5,6,7)
    println(isOdd(5))
    println(isOdd(2))

    //function passed as parameter using '::' operator
    //val filteredLst = nums.filter(::isOdd)

    //calling direct function
    /*val filteredLst = nums.filter(fun (num:Int):Boolean {
        return num % 2 != 0
    })*/

    //using lamda instead of function calling
    //val filteredLst = nums.filter({ a:Int -> a % 2 != 0 })

    //using lamda instead of function calling
    //val filteredLst = nums.filter { a: Int -> a % 2 != 0 }

    //by using 'it' varible
    //var filteredLst = nums.filter {it -> it % 2 != 0}
    var filteredLst = nums.filter { it % 2 != 0}

    println(filteredLst)

    //example
    val userList = listOf(
        UserLamda(1, "A"),
        UserLamda(2, "B"),
        UserLamda(3, "C"),
        UserLamda(4, "D"),
        UserLamda(5, "E"),
    )

    /*val filteredUser = userList.filter { mObj: UserLamda ->
        if (mObj.id == 2)
            true
        else
            false
    }*/
    val filteredUser = userList.filter { it.id == 2 || it.name.equals("D") }
    println(filteredUser)

    //map()
    //get square list from nums list
    val listSq = nums.map { it * it }
    println("Square list from num list $listSq")

    //get PaidUser List form UserLamda list
    val paidUserList = userList.map {
        PaidUserLamda(it.id, it.name, isOdd(it.id))
    }
    println("paid user list $paidUserList")

    //forEach
    /*for(i:Int in nums){
        println("without forEach : $i")
    }

    nums.forEach {println(" using forEach : $it")}*/

    paidUserList.forEach { println("${it.id} - ${it.name} - ${it.type}") }


}

data class UserLamda(val id:Int, val name: String)
data class PaidUserLamda(val id:Int, val name: String, val type:String)

fun isOdd(num:Int):String {
    if (num % 2 != 0)
        return "ODD"
    else
        return "EVEN"
}