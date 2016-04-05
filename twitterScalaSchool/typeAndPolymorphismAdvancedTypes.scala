//view bounds ("type classes")  - can make functions that have to be able to 'see' an argument as a Int or String, "123" can be 'seen' as an Int but not as a Float for example. <% means must be able to be seen as this


implicit def strToInt(x: String) = x.toInt


class Container[A <% Int] { 
  def addIt(x: A) = {
    123 + x
  }
}
println(new Container[String].addIt("123"))
println((new Container[Int]).addIt(123) )
// println((new Container[Float]).addIt(123.2F))  This doesnt work as a float cannot be 'seen' as an integer

println(List(1,2).sum)

/**
A =:= B A must be equal to B

*/

class ContainerTwo[A](value: A) { def addIt(implicit evidence : A =:= Int) = 123 + value}
println(new ContainerTwo(123).addIt)

//Generic programming with views 








