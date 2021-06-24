fun main(args: Array<String>) {
    val kitap = Kitap("Suç ve Ceza", 420, "deneme");
    println("${kitap.yazi} ${kitap.kitapAdi} adlı kitap toplamda ${kitap.sayfaSayisi} sayfa.");
}

class Kitap(val kitapAdi: String, val sayfaSayisi: Int) {
    val yazi = "Merhaba,"
    constructor(kitapAdi: String, sayfaSayisi: Int, yazi: String): this(kitapAdi,sayfaSayisi)
}