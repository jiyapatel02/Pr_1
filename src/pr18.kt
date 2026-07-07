fun main(){
    val a1=arrayOf('a','b','c')
    println(a1.joinToString())
    val a2=Array<Int>(30){0}
    println(a2.joinToString(separator = ";"))
    val a3=Array<Int>(10){i->i*2}
    println(a3.joinToString(separator = ";"))
    a3.shuffle()
    println(a3.joinToString())
    a2.sort()
    println(a2.joinToString())
}