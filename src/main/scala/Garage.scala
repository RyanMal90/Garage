/**
  * Created by Administrator on 12/06/2017.
  */
class Garage {
  val VehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
  val EmployeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]


  def addV(inV: Vehicle) = {
    VehicleArrayBuffer += inV
  }
def addE(addE: Employee) ={
  EmployeeArrayBuffer += addE

}

  def checkFix() ={

    for(x <- 0 to VehicleArrayBuffer.size - 1)
      {
        var totalCost:Double = 0.0
        VehicleArrayBuffer(x).fix == false match
        {
          case true =>
            for(y <- 0 to VehicleArrayBuffer(x).vehicleArrayBuffer.size - 1)
            {
              VehicleArrayBuffer(x).vehicleArrayBuffer(y).needsRepair== false match {
                case true => totalCost += VehicleArrayBuffer(x).vehicleArrayBuffer(y).price
                case false =>
              }
            }
            println("The total cost for parts for this Vehicle:(" + VehicleArrayBuffer(x).iD + "): £" + (f"${totalCost}%5.2f"))
          case false => // do nothing
        }
      }
  }

  def finalFix(Nfx: Vehicle) ={

    for(x <- 0 to VehicleArrayBuffer.size -1) {
      VehicleArrayBuffer(x).fix == false match
        {
        case true => VehicleArrayBuffer(x).fix = true
        case false =>
      }

    }


  }
  def remV(remV: Vehicle) = {
    var position:Int = 0
      for(i <- VehicleArrayBuffer.indices) {
        if(VehicleArrayBuffer(i) == remV) {
          position = i
        }
      }
    VehicleArrayBuffer.remove(position)
    println("After remove: " + VehicleArrayBuffer)

  }
}

//def calculateBill(hours: Double, part: Double): Double = {
 //val hours =
//}