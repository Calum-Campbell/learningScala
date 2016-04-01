//  class ChecksumAccumulator {
//     var sum = 0
// }
// val acc = new ChecksumAccumulator
// acc.sum = 3
// println(acc.sum)

//PRIVATE *******

//   class ChecksumAccumulator {
//     private var sum = 0
//      def add(b: Byte): Unit = {
//           sum += b
//     }
//     def checksum(): Int = { return ~(sum & 0xFF) + 1
//     }
// }
// val acc = new ChecksumAccumulator
//   acc.sum = 5

//REFACTOR *********
// class ChecksumAccumulator {
// private var sum = 0
// def add(b: Byte): Unit = sum += b
// def checksum(): Int = ~(sum & 0xFF) + 1
// } 

//SEMICOLON INTERFERENECE *************
// val s = "hello"; println(s)

for(i <- 1 to 10) {
    println("i is " + i);
}

for(i <- 1 until 10) {
    println("i is " + i);
}








