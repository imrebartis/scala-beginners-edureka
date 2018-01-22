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
