fun main() {
    //ENUM is a set of constant values
    val day = Day.SUNDAY
    println(day)
    println(day.num)

    //to print all values
    for(day in Day.values()) {
        println(day)
        day.printFormattedDay()
    }
}

enum class Day(val num: Int){
    SUNDAY(1),// these are constant values as well as class instances(objecct)
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    /*we can also define functions in to ENUM class */
    fun printFormattedDay(){
        println("DAY is $this")
    }
}