import Fight.*
import Menu.MenuInterface
import HeroInitial.*
import EnemiesInitial.*

fun main() {
    //val objectMenuInterface = MenuInterface()
    val objectFightWithSkeleton = FightWithSkeleton()
    val objectHeroMage = HeroMage()
    val objectHeroWarrior = HeroWarrior()
    val objectHeroSniper = HeroSniper()
    val objectEnemySkeleton = EnemySkeleton()
    objectEnemySkeleton.InitialEnemySkeleton()
    objectHeroSniper.InitialHeroSniper()
    objectHeroWarrior.InitialHeroWarrior()
    objectHeroMage.InitialHeroMage()
    objectFightWithSkeleton.fight()
    //objectMenuInterface.interfaceSimple()
}
