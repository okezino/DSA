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


    fun quickSort(arr : Array<Int>) {
        if(arr.size < 2) return
        var mid =  arr.size / 2
        val left = Array(mid){0}
        val right = Array(arr.size - mid){0}
        for (i in 0 until mid) left[i] = arr[i]
        for (i in mid  until arr.size) right[i - mid] = arr[i]


        quickSort(left)
        quickSort(right)
        merges(arr, left, right)
    }

    private fun merges(arr: Array<Int>, left: Array<Int>, right: Array<Int>){
        val leftSide = left.size
        val rightSide = right.size
        var leftIndex = 0
        var rightIndex = 0
        var index = 0


        while( leftIndex < leftSide && rightIndex < rightSide ){
            if(left[leftIndex] <= right[rightIndex]){
                arr[index] = left[leftIndex]
                leftIndex++
            }else{
                arr[index] = right[rightIndex]
                rightIndex++
            }
            index++
        }

        while(leftIndex < leftSide){
            arr[index] = left[leftIndex]
            leftIndex++
            index++
        }

        while(rightIndex < rightSide){
            arr[index] = right[rightIndex]
            rightIndex++
            index++
        }
        println(left.toList())
        println(right.toList())
        println(arr.toList())
        println("=======================")


    }

    fun mergeSort(arr : Array<Int>) : Array<Int>{
        var temp = arr
        mergeSorted(arr, temp,0, arr.size-1)

        return temp
    }

    private fun mergeSorted(arr : Array<Int>, temp : Array<Int>, leftStart : Int, rightEnd:Int){
        if(leftStart >= rightEnd) return
        val mid = (leftStart + rightEnd) / 2
        mergeSorted(arr,temp, leftStart, mid)
        mergeSorted(arr, temp,mid + 1, rightEnd)
        mergeHalves(arr, temp, leftStart, rightEnd)

    }

    private fun mergeHalves(arr : Array<Int>, array: Array<Int>, leftStart : Int, rightEnd :Int){
        var leftEnd = (leftStart + rightEnd) / 2
        var rightStart = leftEnd + 1
        var size = rightEnd - leftStart + 1

        var left = leftStart
        var right = rightStart
        var index = leftStart

        while (
            left <= leftEnd && right <= rightEnd
        ){
            if(arr[left] <= arr[right]){
                array[index] = arr[left]
                left++
            }else{
                array[index] = arr[right]
                right++
            }

            index++
        }


        while ( left <= leftEnd ){
            array[index] = arr[left]
            left++
            index++
        }
        while (right <= rightEnd){
            array[index] = arr[right]
            right++
            index++
        }


    }

}