fun main(args: Array<String>) {
    println("Hello World!")
}

//public example
class publicOrnegi {
    val sayi = 1
    fun fonksiyon1(){

    }
}

//private example
private class privateOrnegi {
    private val sayi = 1
    private fun fonksiyon1(){

    }
}

//protected example
open class SinifA() {
    protected val sayi = 1
}
class SinifB: SinifA() {
    fun getSayi(): Int {
        return sayi;
    }
}

//internal example
class internalOrnegi{
    internal val sayi = 0
    internal fun fonksiyon(){}
}