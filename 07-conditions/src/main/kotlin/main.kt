fun main(args: Array<String>) {
    val name = "Ismek"
    if("ismek".equals(name)) {
        print("equal")
    } else {
        println("not equal")
    }

    val day : Int = 2
    when(day){
        1-> println("Monday")
        2-> println("Tuesday")
        3-> println("Wednesday")
    }

    for(n in 20..40){
        println(n)
    }

    val myArray = arrayOf("ISMEK", "ANDROID COURSE")
    for (n in myArray.indices)
        println("$n : ${myArray[n]}")

    var startPoint : Int = 0
    while (startPoint<=20) {
        println(startPoint)
        startPoint++
    }

    startPoint = 0
    do {
        println(startPoint)
        startPoint++
    }while (startPoint<=20)
}