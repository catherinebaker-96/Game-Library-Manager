class SmartFactory(private val state: Int = 96) {
    fun handle(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 96) % 997
        }
        return value
    }
}

fun main() {
    println(SmartFactory().handle(96))
}
