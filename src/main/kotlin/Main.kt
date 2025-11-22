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
    var currentPizzaCity: PizzaCity
    while (true) {
        println("Добрый день! Выберите город")
        println("1. Москва\n2. Санкт-Петербург\n\n0. Выход из программы")

        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "0" -> break
            else -> {
                println("ERROR")
                exitProcess(1)
            }
        }
        println("Выберите пиццу: ")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца")
        when (readln()) {
            "1" -> pizzaMoscow.neapolitanPizzaSale()
            "2" -> pizzaMoscow.romanPizzaSale()
            "3" -> pizzaMoscow.sicilianPizzaSale()
            "4" -> pizzaMoscow.tyroleanPizzaSale()
            else -> {
                println("ERROR")
                exitProcess(1)
            }
        }
        println("Выберите пиццу: ")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца")
        when (readln()) {
            "1" -> pizzaMoscow.neapolitanPizzaSale()
            "2" -> pizzaMoscow.romanPizzaSale()
            "3" -> pizzaMoscow.sicilianPizzaSale()
            "4" -> pizzaMoscow.tyroleanPizzaSale()
            else -> {
                println("ERROR")
                exitProcess(1)
            }
        }
        when (currentPizzaCity) {
            is CheckPhoto -> pizzaMoscow.showCheckPhoto()
            else -> pizzaPeter.drinkSale()
        }
    }
}