package Menu

class MenuInterface {
    fun interfaceSimple() {
        var choice: Int
        do {
            println("Виберіть операцію від 1 до 4")
            choice = readln().toInt()
            when (choice) {
                1 -> {
                }
                2 -> {
                }
                3 ->{
                }
                4 ->{
                }
            }
        } while (choice != 4)
    }
}
