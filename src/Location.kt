class Location
    (var name: String,
    var dangerLevel: String="Низкий",
    var requiredLevel: Int=1){

    fun isDangerous(): Boolean {
        return dangerLevel == "Высокий"
    }
    fun printLocationInfo() {
        println("Локация: $name, Уровень опасности: $dangerLevel, Требуемый уровень: $requiredLevel")
    }
}