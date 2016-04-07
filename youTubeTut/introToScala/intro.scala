val numbers = List(1,2,3,4)

println(numbers.map(number => number*2))

println(numbers.map(_*2))

def doubleIt(number: Int) = number * 2

println(numbers.map(doubleIt))

val strings = List("Donny","Testing")

val byLength = strings.groupBy(_.length)

byLength(7)

strings.exists(_.length > 5)

//Problem - Given a list of words, you want a list of lists with all the anagrams together. You dont care about short words

val words = List("kitchen", "thicken","the","ababab","testing","bababa")

val wordsNoShort = words.filter(_.length > 4)

wordsNoShort.groupBy(_.sorted).values//the .values here throws away the keys



