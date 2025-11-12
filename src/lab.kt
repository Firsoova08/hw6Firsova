fun main(){
    //1
    val sword = Item("Меч", "оружие", 150)
    val key = Item("Ключ", "ключ")
    sword.printInfo()
    key.printInfo()

    //2
    val forest = Location("Темный лес", "Высокий", 5)
    val village = Location("Тихая деревня", "Низкий", 1)
    println("${forest.name}: ${forest.isDangerous()}")
    println("${village.name}: ${village.isDangerous()}")

    //3
    val hero1 = Hero("Дракон", 6)
    val hero2 = Hero("Вампир", 2)

    val fireball = Spell("Огненный шар", 3, 3)
    val lightning = Spell("Ледяная стрела", 4, 6,)


    hero1.showStats()
    println("Может кастовать ${fireball.name}: ${hero1.canCast(fireball)}")
    println("Может кастовать ${lightning.name}: ${hero1.canCast(lightning)}")

    hero2.showStats()
    println("Может кастовать ${fireball.name}: ${hero2.canCast(fireball)}")
    println("Может кастовать ${lightning.name}: ${hero2.canCast(lightning)}")

    //4
    val goblin = Enemy("Гоблин", 50)
    val orc = Enemy("Орк", 100, 3)
    goblin.printEnemyInfo()
    orc.printEnemyInfo()
    goblin.takeDamage(20)
    orc.takeDamage(50)




}