class Item {
    var name: String
    var type: String
    var value: Int

    constructor(name: String, type: String, value: Int) {
        this.name = name
        this.type = type
        this.value = value

    }
    constructor(name: String, type: String) {
        this.name = name
        this.type = type
        this.value = 0
    }
    fun printInfo() {
        println("Название: $name, Тип: $type, Стоимость: $value золотых")
    }
}