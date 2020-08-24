import kotlin.random.Random

// Function to generate a random array of a given size
fun generateRandomIntArray(random: Random, size: Int = 30): IntArray {
    return IntArray(size) { random.nextInt(0, 200) }
}

// Creates a show infix method to String Objects so it prints an array with a prefix message
infix fun String.show(array: IntArray) {
    array.forEachIndexed() {idx, value ->
        if(idx == 0) {
            print("$this: [")
        }
        print("$value, ")
        if(idx == array.size - 1){
            println("]")
        }
    }
}

// BubbleSort Algorithm
fun bubbleSort(array: IntArray, size: Int = array.size): IntArray{
    if (size == 1) {
        return array
    }
    for (index in 0 until size - 1){
        if (array[index] > array[index + 1]) {
            val temp = array[index]
            array[index] = array[index + 1]
            array[index + 1] = temp
        }
    }
    return bubbleSort(array, size - 1 )
}

fun main(args: Array<String>){

// Initializing an random array of size 30
    var array = generateRandomIntArray(Random(42))

//    Printing all array elements with prefix message
    "Unordered IntArray" show array

//    Printing sorted array elements with prefix message
    "BubbleSorted IntArray" show bubbleSort(array)





}
