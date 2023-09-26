package HeroInitial

var heroWarriorList: List<Any> = mutableListOf("")
var nameHeroWarrior: Int = 0
var hpHeroWarrior: Int = 0
var mpHeroWarrior: Int = 0
var damageHeroWarrior: Int = 0

class HeroWarrior {
    fun InitialHeroWarrior() {
        heroWarriorList = mutableListOf("Воїн", 200, 50, 30)
        nameHeroWarrior = 0
        hpHeroWarrior = 1
        mpHeroWarrior = 2
        damageHeroWarrior = 3


    }

}