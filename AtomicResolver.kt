class LocalSession(private val state: Int = 4) {
    fun flush(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 4) % 997
        }
        return count
    }
}

fun main() {
    println(LocalSession().flush(4))
}
