for (i <- 1 to 100)
if(i%3 == 0 && i%5 == 0)
println("Fizzbuzz")
else if(i%5 == 0)
println("buzz")
else if(i %3 == 0)
println("fizz")
else
println(i)