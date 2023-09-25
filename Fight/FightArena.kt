package Fight
import EnemiesInitial.damageEnemiesList
import EnemiesInitial.hpEnemiesList
import EnemiesInitial.nameEnemiesList
import HeroInitial.damageHeroesList
import HeroInitial.hpHeroesList
import HeroInitial.tipeOfHeroesList


class FightArena {

    fun fight() {
        for (heroes in tipeOfHeroesList)
        {
            println(heroes.toString())
        }
        var choiceHero : Int = readln().toInt()
        println("Початок битви.\nПервий босс ${nameEnemiesList[0]}\nЗдоров'я босса :${hpEnemiesList[0]}")
        var round : Int = 1
        do {

            println("Раунд $round. ${hpHeroesList[choiceHero]} наносить удар.")
            hpEnemiesList[0] -= damageHeroesList[choiceHero]
            println("Здоров'я босса : ${hpEnemiesList[0]}\n${nameEnemiesList[0]} наносить удар.")
            hpHeroesList[choiceHero] -= damageEnemiesList[0]
            round++
        }while (hpHeroesList[choiceHero] != 0 && hpEnemiesList[0] != 0)
        if (hpHeroesList[choiceHero] <= 0) {
            println("Ви зазнали поразки, бездарь :(")
        }
        else {
            println("Ви перемогли, вітаю!")
        }




    }
}