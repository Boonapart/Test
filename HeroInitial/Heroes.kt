package HeroInitial

var tipeOfHeroesList = mutableListOf("")
var nameHeroesList = mutableListOf("")
var hpHeroesList = mutableListOf(0)
var mpHeroesList = mutableListOf(0)
var damageHeroesList = mutableListOf(0)


class Heroes {
    fun InitialHero() {

        tipeOfHeroesList = mutableListOf("1 - Воїн", "2 - Стрілок", "3 - Маг")
        nameHeroesList = mutableListOf("Ахілес", "Шутрмовик", "Біблійник")
        hpHeroesList = mutableListOf(200, 150, 100)
        mpHeroesList = mutableListOf(50, 75, 200)
        damageHeroesList = mutableListOf(25, 40, 55)
    }
}