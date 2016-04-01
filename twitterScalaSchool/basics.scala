//Function
def addOne(m:Int): Int = m+1
val three = addOne(2)
println(three)

//dont need to specify all the time
def add = 1 +2
println(add)

//Anonoymous functions
val addTwo = (x:Int) => x+2
println(addTwo(1))

//Multi line functions
def timesTwo(i:Int): Int ={
  println("about to times by TWO!")
  i*2
}
println(timesTwo(2))

//partially apply function with _, and use as placeholder
def adder(m:Int, n:Int) = m + n

val add2 = adder(2, _:Int)
println(add2(3))

//Curried functions, lets you apply arguments to functions now and later

def multiply(m:Int)(n:Int): Int = m * n

//one now one later like partialy applied
val timesThree = multiply(3)_
println(timesThree(3))

//curried

val curriedAdd = (adder _ ).curried
val addCouple = curriedAdd(2)
println(addCouple(2))

//Variable length Arguments, methods that can take multiple parameters of a repeated type. 
def capatilizeAll(args: String*) = {
  args.map { arg =>
    arg.capitalize
  }
}
println(capatilizeAll("hello", "tommorow"))

//Classes
class Calculator {
  val brand : String = "HP"
  def add(m:Int, n:Int): Int = m+n 
}
val calc = new Calculator
println(calc.add(100,2))
println(calc.brand)

//Constructors
class Book(brand: String) {
  val color : String = if(brand == "Penguin") {
    "orange"
  }else if(brand == "hp"){
    "blue"
  }else {
    "white"
  }

  def add(m:Int,n:Int):Int = m+n
}

val book = new Book("Penguin")

println(book.color)


//Inheritance
class ScientificCalculator(brand: String) extends Calculator() {
  def log(m:Double,base:Double) = math.log(m)/math.log(base)
}

val sci = new ScientificCalculator("hp")
println(sci.log(10.0,10.0))

//Abstract Classes - Define methods but dont implement them so you can extend the class later and define the method

abstract class Shape {
  def getArea():Int // will define this in the subclass
}

class Circle(r:Int) extends Shape {
  def getArea():Int = r*r*3
}
val c = new Circle(2)
println(c.getArea)

//Traits - fields and behavoir to extend your classes

trait Car {
  val brand: String
}

trait Shiny {
  val shineRefraction : Int
}

class BMW extends Car with Shiny{
  val brand =  "BMW"
  val shineRefraction = 2
}

val beemer = new BMW
println(beemer)


//Types functions dont just have to work with one type of data (e.g Int) If this is the case you will use square brackets to work with any type.
//Below is an example of a cache of generic keys and values

trait Cache[K,V]{
  def get(key: K): V
  def put(key: K, value:V)
  def delete(key: K)

  def remove[K](key: K)
}










