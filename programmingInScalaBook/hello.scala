// Say hello to the first argument
// println("Hello, "+ args(0) +"!")

// var i = 0

// while (i < args.length) {
//     println(args(i))
// i += 1 }

//   var i = 0
//   while (i < args.length) {
//     if (i != 0)
//       print(" ")
//     print(args(i))
// i += 1 }
// println()

// args.foreach(arg => println(arg))
// args.foreach(println)

for (arg <- args)
  println(arg)