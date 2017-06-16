import scala.collection.mutable.ArrayBuffer

abstract class Vehicle {
  var fix: Boolean
  var iD: Int
  var colour: String
  var model: String
  var tyres: Int

  var p1 = new Parts("Engine", 1500.0, false)
  var p2 = new Parts("Wheels", 400.0, false)
  var p3 = new Parts("Exhaust", 450.0, true)

  def spot: Unit
  def showModel(): Unit = { println("Model" + model) }
  def showTyres(): Unit = {println("Number of tyres: " + tyres)}

  def carDetails: Unit ={
    println("Model:" + model + "Tyres:" + tyres)
  }

/*
    for (i <- 0 until VehiclePartArrayBuffer.size) {
      VehiclePartArrayBuffer(i).needsRepair()
     if (VehiclePartArrayBuffer(i).needsRepair())
       broken = true
      broken
    }
*/

  var vehicleArrayBuffer:ArrayBuffer[Parts] = ArrayBuffer()

  def addPart(inPart:Parts)={
    vehicleArrayBuffer += inPart
  }
}
