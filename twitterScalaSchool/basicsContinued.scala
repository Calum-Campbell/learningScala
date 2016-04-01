//apply methods - syntactic sugar for when a method has only one function, for example a constructor like below
class Book {}
object BookMaker {
  def apply() = new Book
}
val newBook = BookMaker()

//Objects -These hold INSTANCES of Classes
object Timer {
  var count = 0

  def currentCount(): Long = {
    count +=1
    count
  }
}
println(Timer.currentCount())

//Functions are Objects - This shows the possible syntactic sugar
object addOne extends Function1[Int,Int] {
def apply(m:Int): Int = m + 1
}
//same as
class AddOne extends (Int => Int) {
  def apply(m: Int): Int = m + 1
}

println(addOne(1))

//Packages - You can organise your code inside packages
// package com.twitter.example

// object colorHolder {
//   val BLUE = "Blue"
//   val RED = "Red"
// }
// println("the color is " + com.twitter.example.colorHolder.BLUE)

//Patern Matching - mathcing values
val times = 1

times match {
  case 1 => "one"
  case 2 => "two"
  case _ => "some other value"
}
//or with statements
times match {
  case i if i == 1 => "one"
  case i if i == 2 => "two"
  case _ => "some other number"
}

//can match on type as well

def bigger(o: Any): Any = {
  o match {
    case i: Int if i <0 => i-1
    case i: Int => i +1
    case d: Double if d < 0.0 => d-0.1
    case d: Double => d+ 0.1
    case text: String => text + "s"
  }
}

//Case classes 
case class Calculator(brand:String, model:String)
val hp20b = Calculator("hp", "20b")

//case classes AND pattern matching 
val hp30b = Calculator("hp", "30b")
val hp40b = Calculator("hp", "40b")

def calcType(calc: Calculator) = calc match {
  case Calculator("hp", "20b") =>"financial"
  case Calculator("hp", "30b") =>"scientific"
  case Calculator(_, _) =>"Uknown type of calcualtor"
}

println(calcType(hp30b))
println(calcType(hp40b))

//Exceptions - try catch finally used to catch errors







