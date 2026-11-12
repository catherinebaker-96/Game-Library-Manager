class CoreRegistry(private val state: Int = 15) {
    fun compute(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 15) % 997
        }
        return total
    }
}

fun main() {
    println(CoreRegistry().compute(15))
}
