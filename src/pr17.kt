fun main(){
    var a=readln().toInt()
    println("Factorial of $a = ${factorial(a)}")
}
fun factorial(n: Int): Int {
    if (n == 0) return 1
    return n * factorial(n - 1)
}