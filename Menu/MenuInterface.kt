package Menu

import EnemysInitial.Enemys
import Fight.FightArena
import HeroInitial.Heroes

class MenuInterface {
    fun interfaceSimple() {
        var choice: Int
        var objectHeroes = Heroes()
        var objectEnemys = Enemys()
        var objectFightArena = FightArena()
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
                    objectHeroes.InitialHero()
                }
            }
        } while (choice != 4)
        objectFightArena.fight()
    }
}
