fun main(){
    val a1= arrayOf(5,41,34,9)
    var max=a1[0]

    for(a in a1){
        if(a > max)
            max=a
    }
    println(max)
}
