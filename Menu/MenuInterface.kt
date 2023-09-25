package Menu

import EnemiesInitial.Enemies
import Fight.FightArena
import HeroInitial.Heroes

class MenuInterface {
    fun interfaceSimple() {
        var choice: Int
        var objectHeroes = Heroes()
        var objectEnemys = Enemies()
        var objectFightArena = FightArena()
        do {
            println("Виберіть операцію від 1 до 4")
            choice = readln().toInt()
            when (choice) {
                1 -> {
                }
                2 -> {
                }
                3 -> {
                }
                4 -> { objectFightArena.fight()

                }
            }
        } while (choice != 4)
        objectFightArena.fight()
    }
}
