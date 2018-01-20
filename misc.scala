for (i <- 1 to 5) println(i)
// =>
// 1
// 2
// 3
// 4
// 5

for (i <- 1 to 5) print(i)
// => 12345

for (i <- 5 to 1 by -1) println(i)
// =>
//5
//4
//3
//2
//1

for (i <- 5 to 1 by -1; j <- 1 to 4) println(i, j)
// =>
/*
(5,1)
(5,2)
(5,3)
(5,4)
(4,1)
(4,2)
(4,3)
(4,4)
(3,1)
(3,2)
(3,3)
(3,4)
(2,1)
(2,2)
(2,3)
(2,4)
(1,1)
(1,2)
(1,3)
(1,4)
*/

// printing numbers as strings:
for (i <- 5 to 1 by -1; j <- 1 to 4) println(s"($i, $j)")

/*
(5, 1)
(5, 2)
(5, 3)
(5, 4)
(4, 1)
(4, 2)
(4, 3)
(4, 4)
(3, 1)
(3, 2)
(3, 3)
(3, 4)
(2, 1)
(2, 2)
(2, 3)
(2, 4)
(1, 1)
(1, 2)
(1, 3)
(1, 4)
*/

//for loop with a guard condition (for with an if inside):
for (i <- 5 to 1 by -1; j <- 1 to 4 if i == j)
    println(s"($i, $j)")
// => 
/*
(4, 4)
(3, 3)
(2, 2)
(1, 1)
*/

// storing output in a list (Vector):
val x = for (i <- 1 to 20 if i % 2 == 0) yield(i)
// => 
// x: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)