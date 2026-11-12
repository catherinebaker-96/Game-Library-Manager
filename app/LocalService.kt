class SecureDispatcher(private val state: Int = 45) {
    fun load(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 45) % 997
        }
        return total
    }
}

fun main() {
    println(SecureDispatcher().load(45))
}
