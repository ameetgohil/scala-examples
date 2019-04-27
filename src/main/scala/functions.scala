object FunctionObject {
  def main(args: Array[String]) {
    functionExample()

    var result = functionExample2()
    println(result)

    functionExample3(10,20)

    var recursionResult = functionRecursion(15,3)

    println(recursionResult)

    var defaultFuncResult1 = defaultFunction(15,2)
    var defaultFuncResult2 = defaultFunction(15)
    var defaultFuncResult3 = defaultFunction()
    println(defaultFuncResult1 + " " + defaultFuncResult2 + " " + defaultFuncResult3)

    var resultParam1 = defaultFunction(a = 15, b = 2)
    var resultParam2 = defaultFunction(b = 15, a = 2)
    var resultParam3 = defaultFunction(15, 2)
    println(resultParam1 + " " + resultParam2 + " " + resultParam3)
  }

  def functionExample() {
    println("This is a simple function")
  }

  def functionExample2() = {
    var a = 10
    a
  }

  def functionExample3(a:Int, b:Int) = {
    var c = a + b
    println(c)
  }

  def functionRecursion(a:Int, b:Int):Int = {
    if(b==0)
      0
    else
      a + functionRecursion(a, b-1)
  }

  def defaultFunction(a:Int = 0, b:Int = 0):Int = {
    a + b
  }
}

