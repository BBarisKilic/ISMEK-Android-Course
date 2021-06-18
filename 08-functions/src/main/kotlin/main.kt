fun main(args: Array<String>) {
    println(login("Baris"))
    exit()

    val writeCourseName:(String) -> Unit = {s:String -> println(s)}
    val name: String = "Android Course"
    writeCourseName(name)
}

fun login(name: String): String {
    return "$name successfully logged in."
}

fun exit() {
    println("Successfully logged out.")
}