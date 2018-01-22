def areaRect(l: Float, b: Float): Float = {
    l * b
}

areaRect(10.23f, 8.4f)
// => res4: Float = 85.93199

// printing the result instead of returning it:
def areaRect(l: Float, b: Float): Unit = {
    println(l * b)
}
areaRect(10.23f, 8.4f)
// => 85.93199

def isEvenNumber(number: Int): Boolean = {
    number % 2 == 0
}

// setting a default argument:
def areaRect(l: Int, b: Int = 10): Int = {
    l * b
}

areaRect(10)
// => res3: Int = 100

// ARRAYS
val arr = new Array[Int](10)
// => arr: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

arr(0) = 100
arr
 / => res1: Array[Int] = Array(100, 0, 0, 0, 0, 0, 0, 0, 0, 0)

 arr.foreach(println)

 val arr = new Array[String](3)
//=> arr: Array[String] = Array(null, null, null)

// ARRAY BUFFERS
import scala.collection.mutable.ArrayBuffer
val arr = new ArrayBuffer[Int]()
// => arr: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
arr += (300, 400, 500)
// => res0: arr.type = ArrayBuffer(300, 400, 500)

arr.foreach(println)

arr ++= Array(600, 700, 800)
// => res1: arr.type = ArrayBuffer(300, 400, 500, 600, 700, 800)

arr --= Array(600, 800)
// => res2: arr.type = ArrayBuffer(300, 400, 500, 700)

//arr.trimEnd(2) // removes last 2 elements
// arr.insert(2, 9) // adds element at 2nd index
// arr.insert(2, 10, 11, 12) // adds a list ( // => res6: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(300, 400, 10, 11, 12, 500))
a.remove(2) // removes an element
a.remove(2, 3) // removes 3 elements from index 2

// printing out the odd numbers:
for (n <- arr if n% 2 != 0) println(n)

//collecting the odd numbers:
for (n <- arr if n% 2 != 0) yield(n)
// => res8: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(11)

//collecting the odd numbers with filter:
arr.filter(_ % 2 != 0)
// => res9: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(11)

arr.sum // sum of Array
arr.max //the biggest number of the Array
arr.mkString("**") // => res13: String = 300**400**10**11**12**500

//MAPS (they are unordered/unsorted)
var colors = Map("red" -> "#FF0000", "yellow" -> "#FF000")

colors("red")
// => res1: String = #FF0000

colors.get("red")
// => res0: Option[String] = Some(#FF0000)

colors.getOrElse("bla", "Key not found")
// => res3: String = Key not found

// TUPLES (they can hold elements of different data types + they are immutable)

var t = (14, 45.69, "Australia")

t._1
// => res0: Int = 14 // index starts from 1 in tuples!




