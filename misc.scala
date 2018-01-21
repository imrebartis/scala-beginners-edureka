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