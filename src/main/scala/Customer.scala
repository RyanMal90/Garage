class Customer(var custID: Int, var firstName: String, var surName: String, var age: Int, var address: String) extends Person {

  def customerDetails: Unit = {
    println("Customer ID:" + custID + "First Name: " + firstName + "Surname: " + surName + "Age:" + age + "Address" + address)
  }
  override def toString: String = "Customer ID: " + custID + " " + "Name: " + firstName + " " + surName + " " + "Age: " + age + " " + "Address:" + " " +address
}
