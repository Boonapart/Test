package Hero

import HeroInitial.Hero


class SelectHero {
    fun selectHero() {

        var objectHero = Hero()
        printHeroList()
        var choiceHero: Int = readln().toInt()

        when (choiceHero) {
            1 -> {
                objectHero.InitialHeroWarrior()
            }

            2 -> {
                objectHero.InitialHeroMage()
            }

            3 -> {
                objectHero.InitialHeroSniper()

            }
        }

    }

    private fun printHeroList() {
        var heroListName: List<String> = listOf("1  -> Воїн", "2 -> Маг", "3 -> Снайпер")
        for (hero in heroListName) {
            println(hero)
        }
    }
}
