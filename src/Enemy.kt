class Enemy(
val name: String,
var health: Int,
val aggressionLevel: Int = 2
) {
    fun calculatePower(): Int {
        return health * aggressionLevel
    }

    fun printEnemyInfo() {
        println("Враг: $name, Здоровье: $health, Уровень агрессии: $aggressionLevel")

    }
    fun takeDamage(damage: Int) {
        health -= damage
        if (health < 0) health = 0
        println("$name получает $damage урона! Осталось здоровья: $health")
        println("Новая сила: ${calculatePower()}")
    }
}