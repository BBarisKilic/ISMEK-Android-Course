sealed class Egitim{
    class Ogretim: Egitim()
    class Ogrenci: Egitim()
}

fun main(args: Array<String>) {
    val egitim: Egitim = Egitim.Ogrenci()

    val cikti = when(egitim) {
        is Egitim.Ogretim -> {
            "Öğretmen sınıfı tipinde nesne üretildi."
        }
        is Egitim.Ogrenci -> {
            "Öğrenci sınıfı tipinde nesne üretildi."
        }
    }

    println(cikti)
}