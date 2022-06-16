import java.util.Stack

object MatchBracket {
    private var arrType = arrayListOf(arrayListOf('(',')'), arrayListOf('{','}'), arrayListOf('[',']'))

    private fun isOpen(s: Char): Boolean {
        for (i in arrType){
            if(i[0] == s) return true
        }
        return false
    }

    private fun matchesTop(pop: Char, char: Char): Boolean {
        for(i in arrType){
            if(pop == i[0] ){
                return char == i[1]
            }
        }
      return false
    }

    fun isBalanced(s: String): String {
        // Write your code here
        val stack = Stack<Char>()
        for(i in s) {
            if (isOpen(i)) stack.push(i) else {
                if(!matchesTop(stack.pop(), i)) return "NO"
            }
        }
        return if(stack.isEmpty()) "YES" else "NO"

    }

}