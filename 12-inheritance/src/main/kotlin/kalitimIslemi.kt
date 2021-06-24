open class Adem {
    open fun konus(){
        print("Adem konuştu")
    }
}

class Insanlik: Adem() {
    override fun konus(){
        print("İnsanlık konuştu")
    }
}

fun main(args: Array<String>) {
    var insanlik = Insanlik()
    insanlik.konus()
}