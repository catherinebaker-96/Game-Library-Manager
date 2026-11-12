class HybridWorker(private val state: Int = 73) {
    fun sync(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 73) % 997
        }
        return total
    }
}

fun main() {
    println(HybridWorker().sync(73))
}
