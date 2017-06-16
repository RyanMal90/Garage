/**
  * Created by Administrator on 13/06/2017.
  */
object main extends App {
 var a = new Garage
  var b = new Bike(5,"Denim Black", "Harley Davidson", 2,false)
  var b1 = new Bike(6,"Black", "Norton", 2,true)
  var b2 = new Bike(7," Red", "BSA", 2,true)
  var b3 = new Bike(8,"Cyan", "Victory", 2,true)
  var car = new Car(9, "Green", "Mercedes", 4, false)

  var c = new Customer(1, "Billy", "Baker" ,21 ,"Cheery blossom Hill" )
  var d = new Employee(20, "Jason", "Bourne" ,28,"Langley Virginia" )
  var e = new Employee(21, "Daniel", "Stand", 29, "Manchester" )



 a.addV(b)
 a.addV(b1)
 a.addV(b2)
 a.addV(b3)
 a.addV(car)

 a.addE(d)
 a.addE(e)

 a.checkFix()

  a.VehicleArrayBuffer.foreach(i => println(i))
  println(b.toString)
  println(c.toString)
a.EmployeeArrayBuffer.foreach(i => println(i))


  a.remV(b)

  //print(a.toString)
}
