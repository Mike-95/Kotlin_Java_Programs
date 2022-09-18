internal object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        var q = 0
        val r = 0
        var p = 0
        var x = 0
        var bin = 0
        while (q < r) {
            p = 40 - 3 * q
            while (p > 0) {
                println(" ")
                --p
            }
            x = 0
            while (x <= q) {
                bin = if (x == 0 || q == 0) 1 else bin * (q - x + 1) / x
                print("    ")
                print(bin)
                ++x
            }
            println("")
            ++q
        }
    }
}