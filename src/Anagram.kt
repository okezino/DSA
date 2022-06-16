import kotlin.math.abs

object Anagram {


    fun makeAnagram(a: String, b: String): Int {
        val firStrCnt = makeCharCount(a)
        val secStrCnt = makeCharCount(b)
        return compareStrCnt(firStrCnt, secStrCnt)
    }

    private fun makeCharCount(s: String): Array<Int> {
        var array = Array(26) { 0 }
        for (i in s) array[i.code - 'a'.code]++
        return array
    }

    private fun compareStrCnt(arr1: Array<Int>, arr2: Array<Int>): Int {
        var delta = 0
        for(i in 0..25){
            delta += abs(arr1[i] - arr2[i])
        }
        return  delta
    }
}