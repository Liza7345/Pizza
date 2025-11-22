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
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца\n0. Показать статистику")
        extracted(pizzaMoscow, currentPizzaCity)
        println("Выберите пиццу: ")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца\n0. Показать статистику")
        extracted(pizzaPeter, currentPizzaCity)
        }
    }

private fun extracted(pizzaPeter: PizzaPeter, currentPizzaCity: PizzaCity) {
    when (readln()) {
        "1" -> {
            pizzaPeter.neapolitanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "2" -> {
            pizzaPeter.romanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "3" -> {
            pizzaPeter.sicilianPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "4" -> {
            pizzaPeter.tyroleanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "0" -> currentPizzaCity.showStatisttics()
        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}

private fun extracted(pizzaMoscow: PizzaMoscow, currentPizzaCity: PizzaCity) {
    when (readln()) {
        "1" -> {
            pizzaMoscow.neapolitanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "2" -> {
            pizzaMoscow.romanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "3" -> {
            pizzaMoscow.sicilianPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "4" -> {
            pizzaMoscow.tyroleanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "0" -> currentPizzaCity.showStatisttics()
        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}

fun selectAddService (currentPizzaCity: PizzaCity) {
    when (currentPizzaCity) {
        is CheckPhoto -> currentPizzaCity.showCheckPhoto()
        is Drink -> currentPizzaCity.drinkSale()
    }
}