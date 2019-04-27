class Bank {
  def getRateOfInterest() = {
    0
  }
}

class SBI extends Bank {
  override def getRateOfInterest() = {
    8
  }
}

class BOA extends Bank {
  override def getRateOfInterest() = {
    3
  }
}

class UXB extends Bank {
  override def getRateOfInterest() = {
    9
  }
}

object Overriding {
  def main(args:Array[String]) {
    var s = new SBI()
    var b = new BOA()
    var u = new UXB()
    println("SBI: " + s.getRateOfInterest())
    println("BOA: " + b.getRateOfInterest())
    println("UXB: " + u.getRateOfInterest())
  }
}
