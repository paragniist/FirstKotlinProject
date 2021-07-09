import java.awt.SystemColor.info

//VariableTest
//Note: In kt, there is no need of class declaration explicitly, whatever the file name we declared, the same name will be considered as class name.

/*EG1
fun main(args:Array<String>)
{
    var name = " "
    name = "Manu"
//Not recommendable choice    print("Person name is: "+ name)
    print("Person name is: $name")

}
*/

/*//EG2
fun main(args:Array<String>)
{
    var name = " "
    name = readLine()!!
    print("Person name is: $name")

}*/

//EG3
/*fun main(args:Array<String>)
{
    var today:Byte = 28
    println("Today is: $today")
    //println("Tomorrow is: $today+1") //this will give output as 28+1, to fix this follow below syntax

    println("Tomorrow is: ${today+1}")
}*/

/*
//EG4
fun main(args:Array<String>)
{
    var month:String? = null

    //month= readLine()

    println("Month is : $month")

    println("Month length is : ${month!!.length}")

}*/

//EG5
/*
fun main(args:Array<String>) {

    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    println(sum(num1,num2))
    displayTodayInfo()
    displayMonthInfo()
    dayInfo()

}

fun sum(a:Int,b:Int) = a+b // inline fn
fun displayTodayInfo() = println("Today is June 28, 2021")

fun displayMonthInfo():Unit{
    println("Month Index is : 7")
    println("Month is : June")
}

fun dayInfo()="21-07-2018"*/

//EG6
//this is main Constructor
fun main(args:Array<String>){
    val i = Info(2018)
}

class Info(var year:Int)
