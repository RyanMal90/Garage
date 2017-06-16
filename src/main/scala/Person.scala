abstract class Person {
  var custID: Int
  var firstName: String
  var surName: String
  var age: Int
  var address: String

  def showPersonDetails: Unit = {
    println(custID,firstName, surName, age, address)


  }
}