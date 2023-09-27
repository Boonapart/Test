package EnemiesInitial

var enemyDragonList: List<Any> = mutableListOf("")
var nameEnemyDragon: Int = 0
var hpEnemyDragon: Int = 0
var mpEnemyDragon: Int = 0
var damageEnemyDragon: Int = 0

class EnemyDragon {
    fun InitialEnemyDragon() {
        enemyDragonList = mutableListOf("Дімон Дракон", 99999, 99999, 99999)
        nameEnemyDragon = 0
        hpEnemyDragon = 1
        mpEnemyDragon = 2
        damageEnemyDragon = 3


    }
}