fun main() {
//    println("i will be great")




    println(closestNumbers1(arrayOf(6,2,4,10)))
}

fun closestNumbers1(numbers: Array<Int>): Unit {
    // Write your code here
    numbers.sort()
    var min = Integer.MAX_VALUE
    var list = mutableListOf<String>()
    for(i in 0..numbers.size - 2){
        var dif = Math.abs(numbers[1 + 1] - numbers[i])
        if(dif == min){
            list.add("${numbers[i]} ${numbers[i + 1]}")
        }else if(
                dif < min
        ){
            list = mutableListOf<String>()
            list.add("${numbers[i]} ${numbers[i + 1]}")
            min = dif
        }
    }

    for(i in list){
        println(i)
    }

}

//fun closestNumbers(numbers: Array<Int>): Unit {
//    // Write your code here
//    numbers.sort()
//    var min = Integer.MAX_VALUE
//    var pair = ""
//    for(i in 0..numbers.lastIndex){
//        var absDiff = 0
//        if(numbers[i] > 0 && numbers[i + 1] > 0 || numbers[i] < 0 && numbers[i + 1] < 0){
//            absDiff = Math.abs(numbers[i] - numbers[i + 1])
//        }else {
//            absDiff = Math.abs(numbers[i] + numbers[i + 1])
//        }
//
//        if(absDiff < min){
//            min = absDiff
//            pair = ""
//            pair =
//
//        }
//
//
//    }
    fun closestNumbers(numbers: Array<Int>): Unit {
        // Write your code here
        numbers.sort()
        var min = Integer.MAX_VALUE
        var pair = ""
        for (i in 0..numbers.size - 2){
            var absDiff = 0
            if(numbers[i] > 0 && numbers[i + 1] > 0 || numbers[i] < 0 && numbers[i + 1] < 0){
                absDiff = Math.abs(numbers[i] - numbers[i + 1])
            }else {
                absDiff = Math.abs(numbers[i] + numbers[i + 1])
            }

            if(absDiff < min){
                min = absDiff
                pair  = ""
                pair = "" + numbers[i] + " " + numbers[i + 1]

            }else if(absDiff == min) {
                pair = "" + numbers[i] + " " + numbers[i + 1]
            }
        }

        println(pair)


    }

//}