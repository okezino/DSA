object SortAlgo {
    /**
     * This is the simple sorting technique
     * Involves taking the largest to the last, comes back and take the largest to the second to the last until its all sorted
     */
    fun bubbleSort(arr : Array<Int>) : Array<Int>{
        var lastIndex = arr.lastIndex
        var sorted = false

        while (!sorted){
            sorted = true
            for(i in 0 until lastIndex){
                if(arr[i] > arr[i + 1]) {
                    sorted = false
                  val a =   arr[i]
                    arr[i] = arr[i + 1]
                    arr[i + 1] = a
                }
            }
            lastIndex--
        }
      return arr
    }

    fun insertionSort(arr : Array<Int>) : Array<Int>{
       for(i in 1..arr.lastIndex){
           var crt = arr[i]
           var j = i - 1

           while (j >= 0 && arr[j] > crt){
               arr[j + 1] = arr[j]
               j--
           }
           arr[j + 1] = crt
       }

        return arr
    }

    fun countingSort(arr : Array<Int>){

    }

    fun quickSort(arr : Array<Int>){

    }

    fun mergeSort(arr : Array<Int>){

    }

    fun heapSort(arr : Array<Int>){

    }
}