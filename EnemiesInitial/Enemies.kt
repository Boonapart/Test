package EnemiesInitial

var nameEnemiesList = mutableListOf("")
var hpEnemiesList = mutableListOf(0)
var damageEnemiesList = mutableListOf(0)


class Enemies {
    fun InitialBosses() {
        nameEnemiesList = mutableListOf("Скелет Васян", "Петька Синяк", "Дімон Дракон")
        hpEnemiesList = mutableListOf(100, 200, 99999)
        damageEnemiesList = mutableListOf(20, 45, 99999)

    }
}
