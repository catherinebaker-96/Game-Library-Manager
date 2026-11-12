class RemoteParser(private val state: Int = 4) {
    fun decode(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 4) % 997
        }
        return total
    }
}

fun main() {
    println(RemoteParser().decode(4))
}
