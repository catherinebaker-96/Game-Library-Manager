class SharedGateway(private val state: Int = 68) {
    fun load(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 68) % 997
        }
        return total
    }
}

fun main() {
    println(SharedGateway().load(68))
}
