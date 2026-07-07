open class Car(var model:String){
    var price:Double=0.0

}
class Suzuki(m:String):Car(model = m){
    constructor(m:String,p:Double):this(m){
        price=p
    }

}
fun main(){
    val car=Suzuki(m = "BMW",p = 10000.0)
    println(car.model)
    println(car.price)
}