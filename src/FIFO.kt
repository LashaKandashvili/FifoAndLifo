import java.util.*

class FIFO {
    companion object DrozeDaprinteSteki

    fun main(){
        val FIFO : Deque<String> = LinkedList()

        with (FIFO){
            print("cifri1 :")
            val num1 = readLine()
            add(num1)
            print("cifri2 :")
            val num2 = readLine()
            add(num2)
            print("cifri3 :")
            val num3 = readLine()
            add(num3)
            print("cifri4 : ")
            val num4 = readLine()
            add(num4)
            print("cifri5 :")
            val num5 = readLine()
            add(num5)
            print("cifri6 :")
            val num6 = readLine()
            add(num6)
            print("cifri7 :")
            val num7 = readLine()
            add(num7)
            print("cifri8 :")
            val num8 = readLine()
            add(num8)
            print("cifri9 :")
            val num9 = readLine()
            add(num9)
            print("cifri10 :")
            val num10 = readLine()
            add(num10)
            remove(num1)
        }

        while (FIFO.isNotEmpty()) {
            println(FIFO.removeFirst())
        }
    }
    }

