package EnemiesInitial

var enemyOgreList: List<Any> = mutableListOf("")
var nameEnemyOgre: Int = 0
var hpEnemyOgre: Int = 0
var mpEnemyOgre: Int = 0
var damageEnemyOgre: Int = 0

class EnemyOgre {
    fun InitialEnemyOgre() {
        enemyOgreList = mutableListOf("Орг", 300, 100, 35)
        nameEnemyOgre = 0
        hpEnemyOgre = 1
        mpEnemyOgre = 2
        damageEnemyOgre = 3


    }
}