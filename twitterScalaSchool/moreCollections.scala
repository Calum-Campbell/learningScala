//The basics again:

//List - ordered  list of one type
println(List(1,2,3))
//same as
println(1 :: 2 :: 3 :: Nil)

//Set - collection of items with no duplicates
println(Set(1,1,2,3,2,55,3)) //Set(1,2,3,55)

//Seq - have a defined order
println(Seq(1,1,2,3,2))

//Maps are key value pairs
println(Map('a' -> 1, 'b'->2))

println(Map.empty ++ List(("x",1),("y",2)))

val setOne = Set(1,2,2,3,444,5)
println( setOne.contains(1))

//all the above are immutable so how about some mutable? have to declare it as mutable
val numbers = collection.mutable.Map(1 ->2)
println(numbers.getOrElseUpdate(2,3))
println(numbers)