
/**Types in Scala 
- parametric polymorphis : generic programming
-(local) type inferenc : why you needn’t say val i: Int = 12: Int
-existential quantificatio : defining something for some unnamed type
-views we’ll learn these next week : “castability” of values of one type to another
*/


//Parametric polymorphism - echieved through specifiign type variables
def drop1[A](l : List[A]) = l.tail
println(drop1(List(1,2,3)))

//scala has rank-1 polymorphism - There are some type concepts youd like to express in Scala that are "Too Generic" for a compiler to understand

def toList[A](a:A) = List(a)
println(toList(1,2,3))

// def foo[A, B](f: A => List[A], b: B) = f(b) - this doesnt work because you have to fix the type of variuables at invocation

//Type Inference - type is infered one expression at a time
def id[T](x:T) = x
println(id(322).getClass)//Int
println(id("String").getClass)//String
println(id(Array(1,2,3,4)).getClass)//Array


//Variance 





















