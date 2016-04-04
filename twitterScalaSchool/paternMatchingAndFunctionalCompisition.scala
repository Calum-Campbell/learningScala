//make to functions:

def f(s:String) = "f(" + s + ")"
def g(s:String) = "g(" + s + ")"

//Compose - makes a new function that coposes other functions e.g f(g(x))
val fComposeG = f _ compose g _
println(fComposeG("yay")) // == f(g(yay))

// andThen - like compose except you call the first function and then the second

val fAndThenG = f _ andThen g _
println(fAndThenG("yay")) // g(f(yay))

//Currying vs Partial Applcition

//Case statements - a subclass of function called a PartialFunctionl.
//A partial function is only defined for certain values and will not take all inputs

val one : PartialFunction[Int, String] = {case 1 => "one"}
val two : PartialFunction[Int, String] = {case 2 => "two"}
val three : PartialFunction[Int, String] = {case 3 => "three"}
val wild : PartialFunction[Int, String] = {case _ => "something else"}

println(one.isDefinedAt(1))
println(one.isDefinedAt(2))

//partial can be composed with a orElse statement that reflects wether the partial is defiined over the supplied argument

val partial = one orElse two orElse three orElse wild

println(partial(1))
println(partial(99))

//The mystery of Case - using case where a function is usually used as things like filter take a function and case can create a predicate fnction

case class PhoneExt(name:String, ext:Int)

val extensions = List(PhoneExt("Steve", 100),PhoneExt("John", 101),PhoneExt("Mark", 201))

println(extensions.filter({case PhoneExt(name,extension) => extension < 200}))
















