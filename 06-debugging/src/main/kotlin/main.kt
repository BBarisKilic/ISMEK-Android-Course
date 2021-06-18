import java.lang.Exception

fun main(args: Array<String>) {
    try {
        //must
        val number : Int = 5
        val text : String = "hello"
        text.toInt()
    } catch (e : Exception) {
        //must
        println("$e Tür dönüşümü hatası")
    } finally {
        //optional
        println("completed.")
    }
}