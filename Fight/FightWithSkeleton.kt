package Fight

import HeroInitial.*
import EnemiesInitial.*
import kotlin.random.Random

var targetHeroHp: Int = 0
var targetHeroDamage: Int = 0
var targetEnemyHp: Int = 0
var targetEnemyDamage: Int = 0
var randomInRangeDamage: Double = 0.0
var bonusDamage: Double = 1.0
var randomInRangeDodge: Double = 0.0


class FightWithSkeleton {
    fun fight() {
        println("Виберіть персонажа : " +
                "\n1 -> ${heroWarriorList[nameHeroWarrior]}" +
                "\n2 -> ${heroSniperList[nameHeroSniper]}" +
                "\n3 -> ${heroMageList[nameHeroMage]}")
        var choiceHero: Int = readln().toInt() - 1
        when (choiceHero) {
            0 -> {
                targetHeroHp = heroWarriorList[hpHeroWarrior] as Int
                targetHeroDamage = heroWarriorList[damageHeroWarrior] as Int
            }

            1 -> {
                targetHeroHp = heroSniperList[hpHeroSniper] as Int
                targetHeroDamage = heroSniperList[damageHeroSniper] as Int
            }

            2 -> {
                targetHeroHp = heroMageList[hpHeroMage] as Int
                targetHeroDamage = heroMageList[damageHeroMage] as Int
            }
        }
        print("Початок битви.\nВаш противник - ${enemySkeletonList[nameEnemySkeleton]}" +
                "\nЗдоров'я : ${enemySkeletonList[hpEnemySkeleton]}" +
                "\nСила атки : ${enemySkeletonList[damageEnemySkeleton]}")
        targetEnemyHp = enemySkeletonList[hpEnemySkeleton] as Int
        targetEnemyDamage = enemySkeletonList[damageEnemySkeleton] as Int
        randomInRangeDamage = Random.nextDouble(0.920, 1.120)
        do {
            var round: Int = 1
            println("\nРаун $round." +
                    "\nВиберіть хід :" +
                    "\n1 -> Атакувати" +
                    "\n2 -> Блокувати" +
                    "\n3 -> Ухилитись")
            var choiceAction: Int = readln().toInt()
            when (choiceAction) {
                1 -> {
                    targetEnemyHp -= targetHeroDamage * bonusDamage.toInt()
                    println("Ви нанесли удар.\nЗдоров'я ${enemySkeletonList[nameEnemySkeleton]} = $targetEnemyHp : ")
                    targetHeroHp -= targetEnemyDamage
                    println("${enemySkeletonList[nameEnemySkeleton]} завдає удару.\nВаше здоров'я становить : ${targetHeroHp}")

                }

                2 -> {
                    targetHeroHp -= targetEnemyDamage / 2
                    bonusDamage = 1.5
                    println("Ви заблокували удар, цим зменшили завдану шкоду\nта ваша наступна атака завдасть додаткової шкоди.\nВаше здоров'я становить : ${targetHeroHp}")
                }

                3 -> {
                    randomInRangeDodge = Random.nextDouble(0.0, 24.0)
                    if (randomInRangeDamage <= 17) {
                        targetHeroHp -= 0
                        println("Ви ухилились від атаки.")
                    } else {
                        targetHeroHp -= targetEnemyDamage
                        println("Ви ухилились від атаки.\nВаше здоров'я становить : ${targetHeroHp}")


                    }
                }
            }

            println("\nЩоб ерейти до наступного раунду, натисніть Enter.")
            readln()
            round + 1


        } while (targetEnemyHp <= 0 && targetHeroHp <= 0)
        println("ya dayn")

    }
}






