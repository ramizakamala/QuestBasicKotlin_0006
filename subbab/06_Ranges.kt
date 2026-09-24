fun main() {
    // operator .. : 1..4 setara dengan 1, 2, 3, 4
    println(1..4)

    // operator ..< : range yang tidak menyertakan nilai akhir, 1..<4 setara dengan 1, 2, 3
    println(1..<4)

    // downTo : rentang urutan terbalik, 4 downTo 1 setara dengan 4, 3, 2, 1
    println(4 downTo 1)

    // step : rentang yang bertambah dengan langkah bukan 1, 1..5 step 2 setara dengan 1, 3, 5
    println(1..5 step 2)

    // rentang Char : 'a'..'d' setara dengan 'a', 'b', 'c', 'd'
    println('a'..'d')

    // 'z' downTo 's' step 2 setara dengan 'z', 'x', 'v', 't'
    println('z' downTo 's' step 2)
}
