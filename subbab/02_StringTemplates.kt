fun main() {
    val customers = 10
    println("There are $customers customers")

    // ekspresi template dengan $variabel
    val nama = "Kotlin"
    println("Hello, $nama")

    // ekspresi template dengan ${kode} yang dievaluasi lalu diubah menjadi string
    val harga = 15000
    val jumlah = 3
    println("Total bayar: ${harga * jumlah}")
}
