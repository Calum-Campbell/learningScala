//Basic Data Structures - Lists, sets, tuple, maps, option

//List - ordered collection (sequence) with indexes(for position in list) and ability to search the list
val numbers = List(1,1,2,3)
println(numbers)

//Sets - sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null elemen
val setNum = Set(1,1,2,3)
println(setNum)

//Tuple - collection of items without class (starts at 1 not 0-index)
val hostPost = ("localhost", 8000)
println(hostPost._1)
println(hostPost._2)

//can make a tuple with special syntacx -> creates a tuple
val tuple = 1-> 2
println(tuple.getClass)

//Maps - maps hold basic datatypes in tuples
val map1 = Map("foo"->"bar", "hello" ->"world")

println(map1)


//Option - a containter that may or may not hold somehting
trait Option[T] {
  def isDefined: Boolean
  def get: T
  def getOrElse(t: T): T
}


val numbersMap = Map("one" -> 1, "two" -> 2)
println(numbersMap.get("two"))
println(numbersMap.get("three"))

//Functional Combinators - map,foreach,filter,zip,partition,drop,foldLeft,flatten,flatMap

//Map - returns a NEW list with same Number of elements
println(numbers.map((i:Int) => i*2))

def timesTwo(i: Int): Int = i*2
println(numbers.map(timesTwo))

//foreach - like map but returns NOTHING inteded for SIDE-EFFECT only.
println(numbers.foreach((i:Int)=> i*2))

//filter - removes an element where the function you pas in evaluate to false
val evenNumbers = numbers.filter((i:Int) => i%2 ==0)
println(evenNumbers)
//another way 
def isEven(i:Int): Boolean = i % 2 == 0
println(numbers.filter(isEven _))

//zip - aggreagates the contents of the two lists into a single list pr pairs
val combinedList = List(1,2,3,4).zip(List("a","b","c"))
println(combinedList)

//partition - splits lists based on where it falls with respect to predicate function (a function that returns true/false) 
val numeros = List(1,2,3,4,5,6,7,8,9,10)
println(numeros.partition(_ % 2 == 0))

//find - finds the first eleement that matches the predicate function 
val smallerThanFive = numeros.find((i:Int) => i>5)
println(smallerThanFive)

//drop - drops first i elements
println(numeros.drop(5))

//dropWhile - removes first elements that match a predicate function
println(numeros.dropWhile(_ % 2 !=0)) // here this is odd numbers, but only one will get dropped then the rest will be 'shielded' by the 1

//foldLeft -
println(numeros.foldLeft(0)((m:Int, n:Int)=> m+n))
/**
seen visualy
scala> numbers.foldLeft(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }
m: 0 n: 1
m: 1 n: 2
m: 3 n: 3
m: 6 n: 4
m: 10 n: 5
m: 15 n: 6
m: 21 n: 7
m: 28 n: 8
m: 36 n: 9
m: 45 n: 10
res0: Int = 55
*/

//flatten - collapses one level of nested structure
println(List(List(1,2),List(3,4)).flatten)

//flatMap - combines mapping and flattening, takes a function that works on a nested lists, concatenates the lists and applies the function
val nestedNumbers = List(List(1,2),List(3,4))
println(nestedNumbers.flatMap(x => x.map(_ * 2)))

//Generalaized funtional combinators, putting functions together
def ourMap(numbers: List[Int], fn: Int=>Int): List[Int] = {
  numbers.foldRight(List[Int]()) { (x:Int, xs:List[Int]) =>
    fn(x) :: xs
  }
}
ourMap(numbers, timesTwo(_))


//MAP? Maps can be though of a list of pairs and keys so the function works on both the key and values in the map.

val extensions = Map("Steve" -> 100,"Bob" -> 101, "Joe" -> 201)

//filter out numbers higher thn 200
println(extensions.filter((namePhone:(String, Int)) => namePhone._2 < 200))
//to make it a bit nicer (dont have to use _.2  a positional accessor)
println( extensions.filter({case (name, phone) => phone < 200}))










