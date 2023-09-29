package Fight

import EnemiesInitial.damageEnemySkeleton
import EnemiesInitial.enemySkeletonList
import EnemiesInitial.hpEnemySkeleton
import EnemiesInitial.nameEnemySkeleton
import HeroInitial.damageHero
import HeroInitial.hpHero
import Roll.rollCube
import kotlin.random.Random

var targetHeroHp: Int = 0
var targetHeroDamage: Int = 0
var targetEnemyHp: Int = 0
var targetEnemyDamage: Int = 0
var randomInRangeDamage: Double = 0.0
var bonusDamage: Double = 1.0
var randomInRangeDodge: Double = 0.0
var penaltyDamage: Int = 8

class FightWithSkeleton {
    fun fight() {
        print(
            "Початок битви.\nВаш противник - ${enemySkeletonList[nameEnemySkeleton]}" +
                    "\nЗдоров'я : ${enemySkeletonList[hpEnemySkeleton]}" +
                    "\nСила атки : ${enemySkeletonList[damageEnemySkeleton]}"
        )
        targetHeroHp = hpHero
        targetHeroDamage = damageHero
        targetEnemyHp = enemySkeletonList[hpEnemySkeleton] as Int
        targetEnemyDamage = enemySkeletonList[damageEnemySkeleton] as Int
        randomInRangeDamage = Random.nextDouble(0.920, 1.120)
        var round: Int = 1
        do {
            println(
                "\nРаун $round." +
                        "\nВиберіть хід :" +
                        "\n1 -> Атакувати" +
                        "\n2 -> Блокувати" +
                        "\n3 -> Ухилитись"
            )
            var choiceAction: Int = readln().toInt()
            when (choiceAction) {
                1 -> {
                    targetEnemyHp -= targetHeroDamage * bonusDamage.toInt()
                    println("Ви нанесли удар в розмірі ${targetHeroDamage * bonusDamage.toInt()}.\nЗдоров'я ${enemySkeletonList[nameEnemySkeleton]} = $targetEnemyHp : ")
                    targetHeroHp -= targetEnemyDamage
                    println("${enemySkeletonList[nameEnemySkeleton]} завдає удару равний ${enemySkeletonList[damageEnemySkeleton]}.\nВаше здоров'я становить : ${targetHeroHp}")
                }

                2 -> {
                    targetHeroHp -= targetEnemyDamage / 2
                    bonusDamage = 1.5
                    println("Ви заблокували удар який становить ${targetEnemyDamage}, цим зменшили завдану шкоду до ${targetEnemyDamage / 2}\nта ваша наступна атака завдасть додаткової шкоди.\nВаше здоров'я становить : ${targetHeroHp}")
                }

                3 -> {
                    if (rollCube >= 13) {
                        targetEnemyHp = targetHeroDamage / 2
                        println("Ви ухилились від атаки, та завдаєте швидку атаку але на половину менше.")
                    } else {
                        targetHeroHp -= targetEnemyDamage + penaltyDamage
                        println("Ви не ухилились від атаки.\nСкелет завдає бонусний урон в розмірі ${targetEnemyDamage + penaltyDamage}\nВаше здоров'я становить : $targetHeroHp")
                    }
                }
            }
            println("\nЩоб ерейти до наступного раунду, натисніть Enter.")
            readln()
            round + 1
            println("$targetEnemyHp $targetHeroHp") //!1

        } while (targetEnemyHp > 0 && targetHeroHp > 0)
        println("ya dayn")
    }
}






