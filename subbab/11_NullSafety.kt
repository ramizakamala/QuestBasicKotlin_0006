// notNull tidak menerima nilai null
fun strLength(notNull: String): Int {
    return notNull.length
}

// Check for null values
fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

// Use safe calls: mengembalikan panjang string atau null
fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    // Nullable types
    // neverNull has String type
    var neverNull: String = "This can't be null"
    // Throws a compiler error
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    println(nullable)
    // You can keep a null here

    // This is OK
    nullable = null

    // By default, null values aren't accepted
    var inferredNonNull = "The compiler assumes non-nullable"
    // Throws a compiler error
    // inferredNonNull = null

    println(neverNull)
    // This can't be null

    println(nullable)
    // null

    println(inferredNonNull)

    println(strLength(neverNull))
    // 18

    // Check for null values
    var nullString: String? = null
    println(describeString(nullString))
    // Empty or null string

    // Use safe calls
    println(lengthString(nullString))
    // null

    // Use Elvis operator
    println(nullString?.length ?: 0)
    // 0
}
