// Runnable has a single method that returns no value and looks like:
// trait Runnable {
//   def run(): Unit
// }
// trait Callable[V] {
//   def call() : V
// }

//THREADS - an independent path of execution within a program. Many threads can run concurrently within a programme. 
val hello = new Thread (new Runnable {
  def run() {
    println("hello world")
  }
})

hello.start

//Thread safety problem
class Person(var name: String) {
  def set (changedName: String){
    name = changedName
  }
}
//This is not safe in multi thread environments, if two threads both call set you cant predict what name with be at the end of the calls. 
//Lets use some tools that force threads to keep a 
//consistent view of data

//Volatile - The value of this variable will never be cached thread-locally: all reads and writes will go straight to "main memory", Access to the variable acts as though it is enclosed in a synchronized block, synchronized on itself.
class PersonVolatile(@volatile var name: String) {
  def set (changedName: String){
    name = changedName
  }
}












