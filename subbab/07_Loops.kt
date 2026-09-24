fun main() {
    // For
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }
    // 12345
    println()

    // While: mengeksekusi blok kode selama ekspresi kondisional bernilai benar
    var angka = 1
    while (angka <= 5) {
        print(angka)
        angka++
    }
    // 12345
    println()

    // Do-while: mengeksekusi blok kode terlebih dahulu, kemudian memeriksa ekspresi kondisional
    var hitungan = 5
    do {
        print(hitungan)
        hitungan--
    } while (hitungan > 0)
    // 54321
    println()
}
