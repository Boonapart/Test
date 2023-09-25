import EnemiesInitial.Enemies
import HeroInitial.Heroes
import Menu.MenuInterface

fun main() {
val objectMenuInterface = MenuInterface()
    val objectHeroInitial = Heroes()
    objectHeroInitial.InitialHero()
    val objectEnemiesInitial = Enemies()
    objectEnemiesInitial.InitialBosses()
    objectMenuInterface.interfaceSimple()
}