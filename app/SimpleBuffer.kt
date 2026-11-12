class BatchBuilder(private val state: Int = 46) {
    fun load(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 46) % 997
        }
        return count
    }
}

fun main() {
    println(BatchBuilder().load(46))
}
