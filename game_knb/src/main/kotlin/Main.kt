fun main() {
    var element = "str"
    var exodus = 0
    var check2 = true
    var exit = true
    val inventory = arrayListOf("Камень", "Ножницы", "Бумага")
    while (exit){
        println ("Вы хотите сыграть? (Да - если хотите, иначе программа завершится)")
        val check = readln()
        if (check.lowercase() != "да") {exit = false}
        else{
        println("Выберите элемент (Камень, Ножницы или Бумага)")
            while (check2){
                element = readln()
            if (element.lowercase() != "камень" && element.lowercase() != "бумага" && element.lowercase() != "ножницы"){
                println("Вы неправильно выбрали элемент! Попробуйте ещё раз")
            } else check2 = false
            }
            check2 = true
        val choicemachine = inventory.random()
        print("Ваш выбор - ${element.lowercase()}")
        println()
        print("Выбор машины - ${choicemachine.lowercase()}")
            println()
        if (element.lowercase() == choicemachine.lowercase()){
            exodus = 0
        }
        else if (element.lowercase() == "ножницы" && choicemachine.lowercase() == "бумага" || element.lowercase() == "бумага" && choicemachine.lowercase() == "камень" || element.lowercase() == "камень" && choicemachine.lowercase() == "ножницы"){
            exodus = 1
        }else
        exodus = 2
            println()
            when (exodus){
                0 -> println("Ничья!")

                1 -> println("Вы победили!")

                2 -> println("Вы проиграли!")
            }
        }
    }
}