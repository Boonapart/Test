package Fight

import EnemiesInitial.damageEnemiesList
import EnemiesInitial.hpEnemiesList
import EnemiesInitial.nameEnemiesList
import HeroInitial.damageHeroesList
import HeroInitial.hpHeroesList
import HeroInitial.tipeOfHeroesList


@Suppress("UNUSED_CHANGED_VALUE")
class FightArena {
    var numberOfBoss: Int = 0

    fun fight() {

        do {
            println("Оберіть героя :")
            for (heroes in tipeOfHeroesList) {
                println(heroes.toString())
            }
            var choiceHero: Int = readln().toInt() - 1

            println("Початок битви.\nПервий босс - ${nameEnemiesList[numberOfBoss]}\nЗдоров'я босса :${hpEnemiesList[numberOfBoss]}\n Сила аткаи босса : ${damageEnemiesList[numberOfBoss]}")
            var round: Int = 1
            do {
                println("1 - почати битву")
                var choice: Int = readln().toInt()

                when (choice) {
                    1 -> {
                        println("Раунд $round. ${hpHeroesList[choiceHero]} наносить удар.")
                        hpEnemiesList[numberOfBoss] -= damageHeroesList[choiceHero]
                        println("Здоров'я босса : ${hpEnemiesList[numberOfBoss]}\n${nameEnemiesList[numberOfBoss]} наносить удар.")
                        hpHeroesList[choiceHero] -= damageEnemiesList[numberOfBoss]
                        println("Ваше здоров'я : ${hpHeroesList[choiceHero]}")
                        round++
                    }
                }
                if (hpHeroesList[choiceHero] <= 0) {
                    hpHeroesList[choiceHero] = 0
                } else if (hpEnemiesList[numberOfBoss] <= 0) {
                    hpEnemiesList[numberOfBoss] = 0
                }

            } while (hpEnemiesList[numberOfBoss] != 0 && hpHeroesList[choiceHero] != 0)
            numberOfBoss++
            var game: Boolean = true
            if (hpHeroesList[choiceHero] <= 0) {
                println("Ви зазнали поразки, бездарь :(")
                game= false
            } else {
                println("Ви перемогли, вітаю!")
            }

        }while (game != true)


    }
}