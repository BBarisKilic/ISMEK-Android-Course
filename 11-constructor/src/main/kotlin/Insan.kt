fun main(args: Array<String>) {
    val insan = Insan(adSoyad = "Baris", yas = 26)
    println("Ad Soyad: ${insan.adSoyad}");
    println("Yaş: ${insan.yas}");
}

class Insan (val adSoyad: String, var yas: Int){
}