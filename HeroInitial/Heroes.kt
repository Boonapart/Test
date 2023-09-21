package HeroInitial
var HPHero: Int = 0
var MPHero: Int = 0
var nameHero: String =""
var attackHero: Int = 0
class Heroes {
    fun InitialHero(){
        var choiceHero: Int
       println("Виберіть клас : ...")
        choiceHero = readln().toInt()
        when(choiceHero){
            1 -> {
                HPHero = 100
                MPHero = 25
                nameHero = "Паладін"
                attackHero = 25
                println("Ви вибрали клас $nameHero")
            }
            2 ->{ //...

            }
        }
    }
}