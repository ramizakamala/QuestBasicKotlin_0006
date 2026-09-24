// x dan y adalah parameter fungsi, keduanya bertipe Int
// tipe hasil fungsi adalah Int, fungsi mengembalikan jumlah x dan y saat dipanggil
fun sum(x: Int, y: Int): Int {
    return x + y
}

// Named arguments dan default parameter values
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

// Functions without return: tipe kembaliannya Unit, return boleh dihilangkan
fun printMessage(message: String) {
    println(message)
    // `return Unit` or `return` is optional
}

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    println(sum(1, 2))
    // 3

    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello

    // Function called with both parameters
    printMessageWithPrefix("Hello", "Log")
    // [Log] Hello

    // Function called only with message parameter
    printMessageWithPrefix("Hello")
    // [Info] Hello

    printMessage("Hello")
    // Hello

    println(uppercaseString("hello"))
    // HELLO

    // Ditulis dalam ekspresi lambda
    println({ string: String -> string.uppercase() }("hello"))
    // HELLO
}
