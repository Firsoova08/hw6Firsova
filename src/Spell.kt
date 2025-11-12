class Spell(
    val name: String,
    val width: Int,
    val height: Int
) {
    fun description(): String {
        return "Заклинание $name занимает область ${width}x$height"
    }
}

class Hero(
    val name: String,
    val level: Int,
    val hp: Int = 100
) {
    fun canCast(spell: Spell): Boolean {
        val nameLengthCondition = spell.name.length <= level * 2
        val sizeCondition = spell.width <= 5 && spell.height <= 5
        return nameLengthCondition && sizeCondition
    }

    fun showStats() {
        println("Герой: $name, Уровень: $level, Здоровье: $hp")
    }

}