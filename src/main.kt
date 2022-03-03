fun main(){
    school()
val statement = identity("Jane",20)
    println(statement)
    length()
    greetings("Nyambura")

}
//Given a string "akirachix"write a function that prints out a string composed of 1,3 and 4 chars of string


fun school(){
    var institution = "akirachix"
    println(institution[0] .toString()+ institution[2]+institution[3])
}
//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively. (3 points)

fun identity(name:String , age:Int):String{
    val statement ="Hi,my name is $name and i am $age years old"
    return (statement)
}
//Write a function that takes in a String and returns its length (2 points)
fun length(){
    var sentence= "Akirachix is the place to be"
    println(sentence.length)
}


//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is” (3 points)

fun greetings(name:String){
    if (name.equals("Nyambura")){
        println("that's me")

    } else
        println("i don't now who that is")
}






