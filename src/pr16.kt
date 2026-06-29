fun main(){
    var a1=readln().toInt()
    var a2=readln().toInt()
    println(add(a1,a2))
    println(subtract(a1,a2))
    println(multiply(a1,a2))
    println(divide(a1,a2))
}
fun add(a1:Int,a2:Int):Int{
    return a1+a2
}
fun subtract(a1:Int,a2:Int):Int{
    return a1-a2
}
fun multiply(a1:Int,a2:Int):Int{
    return a1*a2
}
fun divide(a1:Int,a2:Int):Int{
    return a1/a2
}