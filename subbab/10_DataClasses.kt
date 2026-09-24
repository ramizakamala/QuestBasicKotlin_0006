// Mendeklarasikan kelas data dengan kata kunci data
data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Print as string: println() otomatis memanggil toString()
    println(user)
    // User(name=Alex, id=1)

    // Compare instances
    println("user == secondUser: ${user == secondUser}")
    // user == secondUser: true

    println("user == thirdUser: ${user == thirdUser}")
    // user == thirdUser: false

    // Copy instance: salinan yang tepat dari User
    println(user.copy())
    // User(name=Alex, id=1)

    // Copy instance dengan nama: "Max"
    println(user.copy("Max"))
    // User(name=Max, id=1)

    // Copy instance dengan id: 3
    println(user.copy(id = 3))
    // User(name=Alex, id=3)
}
