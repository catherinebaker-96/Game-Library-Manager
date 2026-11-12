class BatchService(private val state: Int = 89) {
    fun handle(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 89) % 997
        }
        return result
    }
}

fun main() {
    println(BatchService().handle(89))
}
