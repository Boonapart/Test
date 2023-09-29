package EnemiesInitial

var enemySkeletonList: List<Any> = mutableListOf("")
var nameEnemySkeleton: Int = 0
var hpEnemySkeleton: Int = 0
var mpEnemySkeleton: Int = 0
var damageEnemySkeleton: Int = 0


class EnemySkeleton {
    fun InitialEnemySkeleton() {
        enemySkeletonList = mutableListOf("Скелет Васька", 150, 100, 15)
        nameEnemySkeleton = 0
        hpEnemySkeleton = 1
        mpEnemySkeleton = 2
        damageEnemySkeleton = 3


    }
}
