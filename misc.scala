// declaring a float (mutable):
var x: Float = 10.3f
// = > x: Float = 10.3

// how to avoid allocating memory to a variable:
lazy val x = 10000000000000000000
// => x: Int = <lazy>

lazy val x = (1 to 100000).toList
x.reduce(_ + _)
// => res1: Int = 705082704
