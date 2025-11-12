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
}