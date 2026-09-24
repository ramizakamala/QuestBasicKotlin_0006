// Mendeklarasikan kelas dengan kata kunci class
class Customer

// Properties dideklarasikan di dalam tanda kurung () setelah nama kelas
class Contact(val id: Int, var email: String) {
    // Member function, dideklarasikan di dalam badan kelas
    fun printId() {
        println(id)
    }
}

fun main() {
    // Create instance menggunakan konstruktor
    val contact = Contact(1, "mary@gmail.com")

    // Prints the value of the property: email
    println(contact.email)
    // mary@gmail.com

    // Updates the value of the property: email
    contact.email = "jane@gmail.com"

    // Prints the new value of the property: email
    println(contact.email)
    // jane@gmail.com

    // Calls member function printId()
    contact.printId()
    // 1
}
