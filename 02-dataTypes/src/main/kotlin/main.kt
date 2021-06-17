fun main(args: Array<String>) {
    val i : Int = 123
    var d : Double = 123.3
    val f : Float = 123f
    var l : Long = 1223445533
    val s : Short = 10
    var b : Byte = 5
    val numbers = arrayOf(1,2,3,4)

    println("Int type: " + i)
    println("Double type: " + d)
    println("Float type: " + f)
    println("Long type: " + l)
    println("Short type: " + s)
    println("Byte type: " + b)
    for (number in numbers)
        println(number)
}