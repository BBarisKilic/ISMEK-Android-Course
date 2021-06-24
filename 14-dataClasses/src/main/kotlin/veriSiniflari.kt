fun main(args: Array<String>) {
    val telefon: Telefon = Telefon("Apple", "iPhone 7", 2.0, 5.5)
    println("Telefon markası: ${telefon.marka}")
    println("Telefon modeli: ${telefon.model}")
    println("Telefon ram miktarı: ${telefon.ramMiktarı}")
    println("Telefon ekran boyutu: ${telefon.ekranBoyutu}")
    println(telefon.toString())
}

data class Telefon(val marka: String, val model: String, val ramMiktarı: Double, val ekranBoyutu: Double)