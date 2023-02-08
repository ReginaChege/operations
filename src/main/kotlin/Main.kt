fun main() {
    printName()
    println("hello + Ashyley")
    var f =remainder(56,5)
    println(f)
    var i=addition(7,9,9,10)
    println(i)
    println("fact+ stay motivated")
}
fun printName(){
    println("Hello everyone")
}
fun printName(name: String){
    println("Hello + name")

}
fun remainder(numa:Int,numb:Int):Int{
    var division= numa % numb
    return division
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum =num1 + num2 + num3 + num4
    return sum
}
fun intrestingFact(fact:String){
    println("fact + stay")

}






