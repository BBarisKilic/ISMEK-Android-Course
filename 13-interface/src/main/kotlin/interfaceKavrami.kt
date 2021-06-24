interface InterfaceOrnegi {
    var sayi: Int //abstract değişken
    fun abstractFonksiyon():String //abstract fonksiyon

    fun selamVer(){
        println("İnterface'in selamVer fonksiyonu çağrildi.")
    }
}

class InterfaceCagir : InterfaceOrnegi {
    override var sayi: Int = 5
    override fun abstractFonksiyon(): String = "Abstract method cagrildi"
}

fun main(args: Array<String>) {
    val nesne = InterfaceCagir()
    println(nesne.sayi)
    nesne.selamVer()
    println(nesne.abstractFonksiyon())
}