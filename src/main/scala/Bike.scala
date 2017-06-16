class Bike(var ID:Int, var col: String, var mod: String, var tyr: Int, var fix: Boolean) extends Vehicle{
  var f: Boolean = fix
  var iD:Int = ID
  var colour: String = col
  var model: String = mod
  var tyres: Int = tyr
  var inFix: Boolean = fix

  if(!fix) {
    addPart(p1)
    addPart(p2)
    addPart(p3)
  }

  def spot: Unit ={
    println(1,"The colour of the Bike is: " + colour + " The model is: " + model + " and has:" + tyres + "wheels"+ "Needs fixing???" + f)
  }

  override def toString: String = "The colour of the Bike is: " + colour + " The model is: " + model + " and has: " + tyres + "wheels" + " " + "Needs fixing???" +
    {
      f match {
        case true => " No"
        case false => " Yes"
      }

    }


}

