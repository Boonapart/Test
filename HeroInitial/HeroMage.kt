package HeroInitial

var heroMageList: List<Any> = mutableListOf("")
var nameHeroMage: Int = 0
var hpHeroMage: Int = 0
var mpHeroMage: Int = 0
var damageHeroMage: Int = 0

class HeroMage {
    fun InitialHeroMage() {
        heroMageList = mutableListOf("Маг", 120, 150, 55)
        nameHeroMage = 0
        hpHeroMage = 1
        mpHeroMage = 2
        damageHeroMage = 3


    }

}