
fun printHello(suffix: String = "World") {
    println("Hello $suffix")
}

infix fun String.on(suffix: String){
    println("$this $suffix")
}

fun main(argv: Array<String>) {

    println("Hello World")

    printHello()
    printHello(suffix="Diogo!")


    "Hello".on("World")
    "Hello" on "World"

}