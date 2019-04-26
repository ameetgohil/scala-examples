import scala.util.control.Breaks._
object Hi {
  def main(args: Array[String]) {
    println("Hi!")

    var data = 100
    println("data: " + data)
    data = 101
    println("data: " + data)

    val valData = 98
    println("valData: " + valData);

    //valData = 99 // error valData is immutable

    var age:Int = 20
    if(age > 18) {
      println("Age is greater than 18")
    } 

    var number:Int = 21
    if(number%2 == 0) {
      println("Even number")
    } else {
      println("Odd number")
    }

    val result = checkIt(-10)
    println(result)

    //Pattern Matching
    var a = 1
    a match{
      case 1 => println("One")
      case 2 => println("Two")
      case _ => println("No")
    }

    var searchResult = search("Hello")
    //print(searchResult)

    // While
    a = 10
    while(a <= 20) {
      println(a);
      a = a + 2
    }

    a = 10
    do {
      println(a);
      a = a + 2
    } while (a <= 25)


    // For
    for(a <- 1 to 10) {
      println(a)
    }

    for(a <- 1 until 10) { // excludes 10
      println(a)
    }

    for(a <- 1 to 10 if a%2 == 0) {
      println(a)
    }

    var loopResult = for(a <- 1 to 10) yield a
    for(i <- loopResult) {
      println(i)
    }

    var list = List(1,2,3,4,5,6,7,8,9)
    for(i <- list) {
      println(i)
    }

    list.foreach{
      println
    }
    list.foreach(print)
    println
    list.foreach((element:Int) => print(element + " "))

    for(i <- 1 to 10 by 2) {
      println(i)
    }

    for(i <- 1 to 3) {
      breakable {
        for(j <- 1 to 3) {
          if(i == 2 & j == 2)
            break
          println(i + " " + j)
        }
      }
    }

  }

  def checkIt(a:Int) = if(a >= 0) 1 else -1

  def search(a:Any):Any = a match {
    case 1 => println("One")
    case "Two" => println("Two")
    case "Hello" => println("Hello")
    case _ => println("No")
  }
}
