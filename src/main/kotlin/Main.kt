import kotlin.system.exitProcess
fun main() {
    val pizzaPeter = PizzaPeter(
        175.0, 241.5,
        167.5, 215.0
    )
    val pizzaMoscow = PizzaMoscow(
        215.0, 250.5,
        180.5, 240.0
    )
    val currentPizzaCity:PizzaCity
    println("Добрый день! Выберите город")
    println("1. Москва\n2. Санкт-Петербург\n")

    val city = readln()
    if (city == "1") {
        currentPizzaCity = pizzaMoscow
        println("Выберите пиццу: ")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца")
        when(readln()) {
            "1" -> pizzaMoscow.neapolitanPizzaSale()
            "2" -> pizzaMoscow.romanPizzaSale()
            "3" -> pizzaMoscow.sicilianPizzaSale()
            "4" -> pizzaMoscow.tyroleanPizzaSale()
            else -> {
                println("ERROR")
                exitProcess(1)
            }
        }
    } else if (city == "2") {
        currentPizzaCity = pizzaPeter
        println("Выберите пиццу: ")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца")
        when(readln()) {
            "1" -> pizzaMoscow.neapolitanPizzaSale()
            "2" -> pizzaMoscow.romanPizzaSale()
            "3" -> pizzaMoscow.sicilianPizzaSale()
            "4" -> pizzaMoscow.tyroleanPizzaSale()
            else -> {
                println("ERROR")
                exitProcess(1)
            }
        }
    } else {
        println("ERROR")
        exitProcess(1)
    }
}