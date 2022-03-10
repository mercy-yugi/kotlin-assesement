fun main(){
program("codeHive")
var result=division(5,2)
println(result)
statement("mercy yugi",23)
kotlin("i find kotlin very fun, it is my best so far")
}
//codeHive, prints 5,6,7,8th characters
fun program(name:String){
    var char1= name[4]
    var char2= name[5]
    var char3= name[6]
    var char4= name[7]
println(char1.toString() +char2 +char3 +char4)

}
//function that returns a modulus
fun division(a:Int,b:Int):Int{
    var modulus= a%b
    return modulus
}
//function that takes in two parameters,p and z, name and age
fun statement(p:String,z:Int):String{
    var outcome="Hi, my name is $p and i am $z years old"
    println(outcome)
    return outcome
}
//function that takes in a string and return its length
fun kotlin(interest:String):String{
    println(interest.length)
    return interest
}