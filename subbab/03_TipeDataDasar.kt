fun main() {
    // Variable dideklarasikan tanpa inisialisasi
    val d: Int
    // Variable dengan inisialisasi
    d = 3
    // Variable jenis explicit dan di inisialisasi
    val e: String = "hello"

    println("d = $d")
    println("e = $e")

    // Integers
    val bilanganBulat: Int = 100
    // Unsigned integers
    val bilanganBulatTanpaTanda: UInt = 200u
    // Floating-point numbers
    val bilanganPecahan: Double = 3.14
    // Booleans
    val boolean: Boolean = true
    // Characters
    val karakter: Char = 'R'
    // Strings
    val teks: String = "Kotlin"

    println("Integers          : $bilanganBulat")
    println("Unsigned integers : $bilanganBulatTanpaTanda")
    println("Floating-point    : $bilanganPecahan")
    println("Booleans          : $boolean")
    println("Characters        : $karakter")
    println("Strings           : $teks")
}
