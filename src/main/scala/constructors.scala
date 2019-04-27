class Student3(id:Int, name:String){
  def showDetails() {
    println(id + " " + name)
  }
}

class Student4(id:Int, name:String) {
  var age:Int = 0

  def showDetails() {
    println(id + " " + name + " " + age)
  }

  def this(id:Int, name:String, age:Int) {
    this(id, name)
    this.age = age
  }
}

class Student5(id:Int) {
  def this(id:Int, name:String) {
    this(id)
    println(id + " " + name)
  }
  println(id)
}

object Constructors {
  def main(args:Array[String]) {
    var s0 = new Student3(101, "Ameet")
    s0.showDetails()

    var s1 = new Student4(102, "Ameet", 30)
    s1.showDetails()

    new Student5(104)
    new Student5(105, "Ameet")
  }
}

