val numbers = List(1,2,3,4)
val noNumbers = List()
val numbersPalin = List(1,2,3,2,1)
val numbersToFlatten = List(List(1, 1), 2, List(3, List(5, 8)))
val removeRepeat = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

//P01 - Find last element in list 

def last[A](l: List[A]):A = l.last
println(last(numbers))
//recursive approach using pattern matching

def lastRecursive[A](l:List[A]):A = l match {
    case h :: Nil => h // head has something and tail is empty(i.e only on element in list therefore must be head)
    case _ :: tail => lastRecursive(tail) // anything and tail therfore tail
    case _ => throw new NoSuchElementException // nothing in the list 
}
println(lastRecursive(numbers))


//PO2 - Find Penultimate element in list
//init provides a list but removes the last element, so the last element of this list wil be the penultimate
def penultimateFunc[A](l:List[A]):A = {
  if (l.isEmpty) throw new NoSuchElementException  
  l.init.last
}

//pattern matching solution 
def lastNth[A](n: Int, l:List[A]): A = l match {
    case tail if (tail.length == n) => tail.head
    case _ :: tail => lastNth(n, tail)
    case _ => throw new NoSuchElementException
}

println(penultimateFunc(numbers))
println(lastNth(2,numbers))

//PO3 Find the kth element of a list

def kthElement[A](k:Int,l:List[A]):A = {
  if (k >= 0 && k < l.length) l(k) // make sure it exist then return the value l(k)
  else throw new NoSuchElementException
}

//recursive solution - keep removing the items until we get to the correct index

def kthElementRecur[A](k:Int, l:List[A]):A = k match {
  case 0 => l.head
  case k if k > 0 => kthElementRecur(k-1, l.tail)
  case _ => throw new NoSuchElementException  

}

println(kthElement(2,numbers))
println(kthElementRecur(2,numbers))


//P04 find the number of elements of a list 

def lengthOfList[A](l:List[A]):Int = {
  l.length
}
println(lengthOfList(numbers))

//recursive method
def lengthOfListRecurs [A](l:List[A]):Int = {
  def helperSum[A](n:Int,l:List[A]):Int = l match{
    case Nil => n
    case h :: t => helperSum(n+1, l.tail)
  }
  helperSum(0, l)
}
println(lengthOfListRecurs(numbers))

//P05 reverse a list 

def reverseList[A](l:List[A]):List[A] = {
  l.reverse
}
println(reverseList(numbers))

//recursive method
def reverseListRecurs[A](l: List[A]): List[A] = l match {
    case h :: tail => reverseListRecurs(tail) ::: List(h) // ::: prepends whole list to another list
    case Nil => Nil
}

println(reverseListRecurs(numbers))

//P06 Find out if a list is a palindrome
def isPalindrom[A](l:List[A]):Boolean = {
  if(l.reverse == l){
    return true
  }else {
    return false
  }
}
println(isPalindrom(numbersPalin))

//recursive 
def isPalindromeRecurs[A](l:List[A]):Boolean = {
  def _palindrome(res:Boolean, rem:List[A]):Boolean = rem match {
    case Nil => true
    case List(a) => true
    case list =>_palindrome(res && rem.tail == rem.last, rem.tail.init)
  }
  _palindrome(true,l)
}
println(isPalindromeRecurs(numbersPalin))


//P07 flatten a nested list structure
def flattenNested(l:List[Any]):List[Any] = l flatMap {
  case ms: List[_] => flattenNested(ms)
  case h => List(h)
}
println(flattenNested(numbersToFlatten))


//P08 eliminate repetative elements of a list
def compress[A](l:List[A]):List[A] = l match {
  case Nil => Nil
  case h :: List() => List(h)
  case h::tail if h ==tail.head => compress(tail)
  case h::tail => h :: compress(tail) 
}
println(compress(removeRepeat))

//P09

































