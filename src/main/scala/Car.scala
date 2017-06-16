//Generates class for vehicle type Car, assign's ID colour, model, how many tyres it has and wether or not it needs fixing with a boolean.
class Car(var ID:Int, var col: String, var mod: String, var tyr: Int, var fix:Boolean) extends Vehicle{
  var f: Boolean = fix
  var iD:Int = ID
  var colour: String = col
  var model: String = mod
  var tyres: Int = tyr
  var inFix: Boolean = fix

  //helps assign parts to the broken vehicles and calculates the cost for the parts.
  if(!fix) {
    addPart(p1)
    addPart(p2)
    addPart(p3)
  }

  def spot: Unit ={
    println("Spotted a car: " + model + " with " + tyres + "wheels")
  }
  override def toString():String = {
    println(" ")
    "The colour of the Car is: " + colour + " The model is: " + model + " and has: " + tyres + "wheels" + " " + "Needs fixing???" + {
      f match {
        case true => " No"
        case false => " Yes"
      }
    }


  }
}

