object SingletonCompanion{
  def main(args:Array[String]){
    SingletonObject.hello()
    new CompanionClass().hello()
    println("And this is Companion Object")
  }
}

class CompanionClass {
  def hello(){
    println("Hello, this is Companion Class")
  }
}

object SingletonObject{
  def hello() {
    println("Hello, This is Singleton Object")
  }
}
