import java.lang.NullPointerException

fun main() {
    var arr = arrayOf(1, 2, 3, 4, 5)
    try {
        println(arr[6])
    } catch (e: NullPointerException){
        e.printStackTrace()
    }
    catch (e: Exception){
        e.printStackTrace()
    }
    finally {
        println("I will execute not matter what")
    }
    
    //throw Exception
    getUserList(4)
    try{
        getUserList(-4)
    }catch(e: Exception){
        println(e.message)
    }
}

fun getUserList(count:Int){
    if (count < 0){
        throw Exception("Illegel argument passed")
    }else{
        println("count passed : $count")
    }
}