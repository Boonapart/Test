package Menu


import EnemiesInitial.EnemySkeleton
import Fight.FightWithSkeleton
import Hero.SelectHero

class MenuInterface {
    fun interfaceSimple() {
        val objectFightWithSkeleton = FightWithSkeleton()
        val objectEnemySkeleton = EnemySkeleton()
        val objectSelectHero = SelectHero()
        objectEnemySkeleton.InitialEnemySkeleton()
        objectSelectHero.selectHero()
        objectFightWithSkeleton.fight()

    }
}
