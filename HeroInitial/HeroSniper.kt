package HeroInitial

var heroSniperList: List<Any> = mutableListOf("")
var nameHeroSniper: Int = 0
var hpHeroSniper: Int = 0
var mpHeroSniper: Int = 0
var damageHeroSniper: Int = 0

class HeroSniper {
    fun InitialHeroSniper() {
        heroSniperList = mutableListOf("Снайпер", 150, 75, 45)
        nameHeroSniper = 0
        hpHeroSniper = 1
        mpHeroSniper = 2
        damageHeroSniper = 3


    }

}