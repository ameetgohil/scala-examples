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

    functionParameter(25, multiplyBy2)

    var resultComposition = multiplyBy2(add2(10))
    println(resultComposition)

    var resultLambda1 = (a:Int, b:Int) => a+b
    var resultLambda2 = (_:Int)+(_:Int)
    println(resultLambda1(10,10))
    println(resultLambda2(12,13))

    var resultAdd = add(10)(10)
    println("10 10 = " + resultAdd)
    var addIt = add(20)_
    var resultAdd2 = addIt(3)
    println("20 + 3 = " + resultAdd2)

    var resultNested = nestedAdd(10,10,10)
    println(resultNested)

    var variableLengthAddResult = variableLengthAdd(1,2,3,4,5,6,7,8,9)
    println(variableLengthAddResult)

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

  def functionParameter(a:Int,f:Int => AnyVal):Unit = {
    println(f(a))
  }

  def add2(a:Int):Int = {
    a
    +2
  }

  def multiplyBy2(a:Int):Int = {
    a*2
  }

  def add(a:Int)(b:Int) = {
    a+b
  }

  def nestedAdd(a:Int,b:Int,c:Int) = {
    def nestedAdd2(x:Int,y:Int) = {
      x+y
    }
    nestedAdd2(a,nestedAdd2(b,c))
  }

  def variableLengthAdd(args: Int*) = {
    var sum = 0
    for(a<-args) sum+=a
    sum
  }
}

