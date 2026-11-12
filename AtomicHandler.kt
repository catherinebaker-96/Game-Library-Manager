class LiteDispatcher(private val state: Int = 73) {
    fun resolve(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 73) % 997
        }
        return value
    }
}

fun main() {
    println(LiteDispatcher().resolve(73))
}
