fun main() {
    // List
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    // [triangle, square, circle]

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    // [triangle, square, circle]

    // View read-only dari mutable List
    val shapesLocked: List<String> = shapes
    println(shapesLocked)

    // Operator akses terindeks []
    println("Item pertama: ${shapes[0]}")
    // Item pertama dan terakhir
    println("Item pertama: ${shapes.first()}")
    println("Item terakhir: ${shapes.last()}")
    // Jumlah item
    println("Jumlah item: ${shapes.count()}")
    // Memeriksa apakah sebuah item ada di dalam List
    println("Apakah ada 'circle'? ${"circle" in shapes}")
    // Menambah dan menghapus item
    shapes.add("pentagon")
    println(shapes)
    shapes.remove("triangle")
    println(shapes)

    // Set
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)
    // [apple, banana, cherry]

    // View read-only dari mutable Set
    val fruitLocked: Set<String> = fruit
    println(fruitLocked)

    // Jumlah item
    println("Jumlah item: ${fruit.count()}")
    // Memeriksa apakah sebuah item ada di dalam Set
    println("Apakah ada 'apple'? ${"apple" in fruit}")
    // Menambah dan menghapus item
    fruit.add("mango")
    println(fruit)
    fruit.remove("banana")
    println(fruit)

    // Map
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // View read-only dari mutable Map
    val juiceMenuLocked: Map<String, Int> = juiceMenu
    println(juiceMenuLocked)

    // Mengakses nilai pada map dengan key-nya
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    // The value of apple juice is: 100

    // Jumlah item
    println("Jumlah item: ${juiceMenu.count()}")
    // Menambah dan menghapus item
    juiceMenu.put("mango", 150)
    println(juiceMenu)
    juiceMenu.remove("orange")
    println(juiceMenu)
    // Memeriksa apakah key tertentu sudah disertakan dalam Map
    println("Apakah ada key 'kiwi'? ${juiceMenu.containsKey("kiwi")}")
    // Mendapatkan koleksi key atau nilai
    println("Keys: ${juiceMenu.keys}")
    println("Values: ${juiceMenu.values}")
    // Memeriksa apakah key atau nilai ada di dalam Map
    println("Apakah key 'apple' ada? ${"apple" in juiceMenu.keys}")
}
