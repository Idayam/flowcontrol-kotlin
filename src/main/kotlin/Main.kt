fun main(){
    numbers()
    println(names(arrayOf("Idaya","pauline","books","cathy")))
    drinks(6)
    drinks(14)
    drinks(20)
    Numbers()


}
//Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun numbers() {
    for (numbers in 1..100) {
        if (numbers %2 !=0) {
            println(numbers)
        }


    }


}

// Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)

fun names(name:Array<String>):Int{
 var items=0
    for (x in name){
        if (x.length >5){
            items++
        }
    }
    return (items)
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)

fun drinks(age:Int){
    when(age){
        0,6-> println("milk")
        7,14-> println("fanta")
        else-> println("cocacola")
    }


}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

fun Numbers(){
for(num in 1..100 )
    if(num%3==0 && num%5==0){
        println("FizzBuzz")
    }
    else if(num %3==0){
        println("Fizz")
    }
    else if(num%5==0){
        println("Buzz")
    }

}
