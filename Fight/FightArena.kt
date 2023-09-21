package Fight

import EnemysInitial.Enemys
import EnemysInitial.HPEnemys
import EnemysInitial.attackEnemys
import EnemysInitial.nameEnemys
import HeroInitial.HPHero
import HeroInitial.Heroes
import HeroInitial.attackHero
import HeroInitial.nameHero

class FightArena {
    var objectHeroes = Heroes()
    var objectEnemys = Enemys()
    fun fight() {
        objectEnemys.InitialSkeleton()
        var choice: Int
        do {
            println("1 - удар")
            choice = readln().toInt()
            when (choice) {
                1 -> {
                    println("${nameHero} наносить удар")
                    HPEnemys -= attackHero
                }
            }
            println("ХП ворога становить $HPEnemys")
            println("Ворог наносить урон")
            HPHero -= attackEnemys
            println("ХП $nameHero становить $HPHero")

        }while (HPHero <= 0 && HPEnemys <= 0)
        if (HPHero <= 0) {
            println("$nameHero помер")
        } else {
            println("$nameEnemys помер")
        }
    }

}