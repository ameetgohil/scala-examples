class Student0 {
  var id:Int = 0
  var name:String = null
}

class Student1(id:Int, name:String) {
  def show() {
    println(id+" "+name)
  }
}

object OOP{
  def main(args:Array[String]) {
    var s0 = new Student0()
    println(s0.id+" "+s0.name)
    var s1 = new Student1(100,"Ameet")
    s1.show()
  }
}

