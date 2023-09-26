package Fight

import HeroInitial.*
import EnemiesInitial.*
import kotlin.random.Random

var targetHeroHp: Double = 0.0
var targetHeroDamage: Double = 0.0
var targetEnemyHp: Double = 0.0
var targetEnemyDamage: Double = 0.0
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
                targetHeroHp = heroWarriorList[hpHeroWarrior] as Double
                targetHeroDamage = heroWarriorList[damageHeroWarrior] as Double
            }

            1 -> {
                targetHeroHp = heroSniperList[nameHeroSniper] as Double
                targetHeroDamage = heroSniperList[damageHeroSniper] as Double
            }

            2 -> {
                targetHeroHp = heroMageList[nameHeroMage] as Double
                targetHeroDamage = heroMageList[damageHeroMage] as Double
            }
        }
        print("Початок битви.\nВаш противник - ${enemySkeletonList[nameEnemySkeleton]}" +
                "\nЗдоров'я : ${enemySkeletonList[hpEnemySkeleton]}" +
                "\nСила атки : ${enemySkeletonList[damageEnemySkeleton]}")
        targetEnemyHp = enemySkeletonList[hpEnemySkeleton] as Double
        targetEnemyDamage = enemySkeletonList[damageEnemySkeleton] as Double
        randomInRangeDamage = Random.nextDouble(0.920, 1.120)
        do {
            var round: Int = 1
            println("Раун $round." +
                    "\nВиберіть хід :" +
                    "\n1 -> Атакувати" +
                    "\n2 -> Блокувати" +
                    "\n3 -> Ухилитись")
            var choiceAction: Int = readln().toInt()
            when (choiceAction) {
                1 -> {
                    targetEnemyHp -= targetHeroDamage * randomInRangeDamage * bonusDamage
                    println("Ви нанесли удар.\nЗдоров'я ${enemySkeletonList[nameEnemySkeleton]} = $targetEnemyHp : ")
                    targetHeroHp -= targetEnemyDamage
                    println("${enemySkeletonList[nameEnemySkeleton]} завдає удару.\nВаше здоров'я становить : ${targetHeroHp}")

                }

                2 -> {
                    targetHeroHp -= targetEnemyDamage * 0.5
                    bonusDamage = 1.5
                    print("Ви заблокували удар, цим зменшили завдану шкоду\nта ваша наступна атака завдасть додаткової шкоди.\nВаше здоров'я становить : ${targetHeroHp}")
                }
                3 -> {
                    randomInRangeDodge = Random.nextDouble(0.0, 24.0)
                    if (randomInRangeDamage <= 17) {
                        targetHeroHp -= 0
                        println("Ви ухилились від атаки.")
                    }
                    else {
                        targetHeroHp -= targetEnemyDamage
                        println("Ви ухилились від атаки.\nВаше здоров'я становить : ${targetHeroHp}")

                    }
                }
            }
            println("Щоб ерейти до наступного раунду, натисніть Enter.")
            readln()


        } while (targetEnemyHp <= 0 || targetHeroHp <= 0)

    }
}






