import java.util.*

fun main(args: Array<String>) {
    var a : String = "Hello"
    println(a.length)
    println(a.equals("er"))
    println("Hello".equals(a))
    println(a.get(2))
    println(a[2])
    a = a.plus(" World!")
    println(a)

    var b : String = "ISMEK Android"
    println(b.subSequence(0,5))
    println(b.capitalize())
    println(b.indexOf("ISMEK"))
    println(b.split(" "))
    println(b.isEmpty())
    println(b.isNotEmpty())
    println(b.random())
    println(b.replace("Android","Droid"))
    println(b.uppercase(Locale.getDefault()))
    println(b.trim())
}