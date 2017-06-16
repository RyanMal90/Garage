class Employee(var custID: Int, var firstName: String, var surName: String, var age: Int, var address: String ) extends Person {

def employeeDetails: Unit ={
  println("Employee ID:" + custID + "First Name: " + firstName + "Surname: " + surName + "Age:" + age + "Address" + address)
}
  override def toString: String = "Employee ID: " + custID + " " + "Name: " + firstName + " " + surName + " " + "Age: " + age + " " + "Address:" + " " +address
}
