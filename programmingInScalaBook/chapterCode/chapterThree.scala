// val greetStrings = new Array[String](3)
//   greetStrings(0) = "Hello"
//   greetStrings(1) = ", "
//   greetStrings(2) = "world"
//   // greetStrings(2) = "bids"
//   for (i <- 0 to 2)
//     print(greetStrings(i))

// SAME AS

// val greetStrings = new Array[String](3)
// greetStrings.update(0, "Hello")
// greetStrings.update(1, ", ")
// greetStrings.update(2, "world!\n")
// for (i <- 0.to(2))
//   print(greetStrings.apply(i))

//LISTS****************
// val oneTwoThree = List(1,2,3)
// println(oneTwoThree)

// val oneTwoThreeFour = 4 :: oneTwoThree  
// println(oneTwoThreeFour)

//Can make a list by defiing NIL

// val oneTwoThree = 1 :: 2 :: 3 :: Nil
// println(oneTwoThree)

//TUPLE *************
// val pair = (99,"hello")
// println(pair._1)
// println(pair._2)

//SETS AND MAPS ********* Sets are immutable, unluss you import it
// var jetSet = Set("Boeing", "Airbus")
// jetSet += "Lear"
// println(jetSet.contains("Cessna"))

// import scala.collection.mutable.Set

// val jetSet = Set("Boeing", "Airbus")
// jetSet += "Lear"
// println(jetSet.contains("Cessna"))

// import scala.collection.mutable.Map
// val treasureMap = Map[Int, String]()
// treasureMap += (1 -> "Go to island.")
// treasureMap += (2 -> "Find big X on ground.")
// treasureMap += (3 -> "Dig.")
// treasureMap += (4 -> "hello")
// println(treasureMap)


//PROGRAMMING WITHOUT VAR , TRY TO USE ONLY VAL
// def printArgs(args: Array[String]): Unit = {
//       for (arg <- args)
//         println(arg)
//     }

// def printArgs(args: Array[String]): Unit = {
//       for (arg <- args)
//         println(arg)
//     }

import scala.io.Source
  def widthOfLength(s: String) = s.length.toString.length
  if (args.length > 0) {
    val lines = Source.fromFile(args(0)).getLines().toList
    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b
    )
    val maxWidth = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length +" | "+ line)
} }
else
Console.err.println("Please enter filename")













