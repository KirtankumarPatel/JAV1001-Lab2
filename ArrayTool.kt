import java.util.*

fun encrypt(input: string, shift: int): String {
    val shiftedChars = input.map { char ->
        when {
            char.isLowerCase() -> ('a' + (char - 'a' + shift) % 26)
            char.isUpperCase() -> ('A' + (char - 'A' + shift) % 26)
            else -> char
        }
    }
    return shiftedChars.joinToString("")
}

fun arrayAvg(array: IntArray): Double {
    if (array.isEmpty()) return 0.0
    var sum = 0
    for (num in array) {
        sum += num
    }
    // array.size
    return sum.toDouble() 
}

fun <T> arrayContains(array: Array<T>, searchValue: T): Boolean {
    return searchValue in array
}

fun <T> reverseArray(array: Array<T>): Array<T> {
    return array.reversedArray()
}

fun main() {
    val scanner = Scanner(System.`in`)

    // Encrypt to the function
    println("Enter to the string to encrypt:")
    val inputString = scanner.nextLine()

    println("Enter to the shift value:")
    val shiftValue = scanner.nextInt()
   // Take the newline character
    scanner.nextLine() 

    val encryptedString = encrypt(inputString, shiftValue)
    println("Encrypted string: $encryptedString")

    // using the ArrayAvg function
    println("\nEnter the values for an integer array (space-separated):")
    val integerArray = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()

    val average = arrayAvg(integerArray)
    println("Average of the array: $average")

    // using the ArrayContains function
    println("\nEnter the values for a string array (space-separated):")
    val stringArray = scanner.nextLine().split(" ").toTypedArray()

    println("Enter to the search value:")
    val searchValue = scanner.nextLine()

    val containsValue = arrayContains(stringArray, searchValue)
    println("Array contains '$searchValue': $containsValue")

    // using the ReverseArray function
    println("\nEnter the values for an integer array (space-separated):")
    val inputArray = scanner.nextLine().split(" ").map { it.toInt() }.toTypedArray()

    val reversedArray = reverseArray(inputArray)
    println("Reversed array: ${reversedArray.joinToString()}")
};