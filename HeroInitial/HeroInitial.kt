package HeroInitial

var heroList: List<Any> = mutableListOf("")
var nameHero: String = ""
var hpHero: Int = 0
var mpHero: Int = 0
var damageHero: Int = 0
var heroWallet: Int = 0

class Hero {
    fun InitialHeroMage() {
        nameHero = "Маг"
        hpHero = 1200000
        mpHero = 150
        damageHero = 55
        heroWallet = 0
        heroList = mutableListOf(nameHero, hpHero, mpHero, damageHero, heroWallet)
    }
    fun InitialHeroSniper() {
        nameHero = "Снайпер"
        hpHero = 1000000
        mpHero = 0
        damageHero = 2
        heroWallet = 4
        heroList = mutableListOf(nameHero, hpHero, mpHero, damageHero,heroWallet)
    }
    fun InitialHeroWarrior() {
        nameHero = "Воїн"
        hpHero = 100000
        mpHero = 2
        damageHero = 3
        heroWallet = 4
        heroList = mutableListOf(nameHero, hpHero, mpHero, damageHero,heroWallet)
    }
}