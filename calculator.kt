import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.tan
import kotlin.math.PI

fun main(args: Array<String>) {
    fun degToRad(deg: Double): Double {
        return deg * PI / 180
    }
    fun radToDeg(rad: Double): Double {
        return rad * 180 / PI
    }
    fun sin(angle: Double): Double {
        return sin(angle)
    }
    fun cos(angle: Double): Double {
        return cos(angle)
    }    
    fun tan(angle: Double): Double {
        return tan(angle)
    }
    println("Engineering calculator in Kotlin.")
    println("What would you like to do?")
    println("1. Convert degrees to radians")
    println("2. Convert radians to degrees")
    println("3. Calculate the sine of an angle")
    println("4. Calculate the cosine of an angle")
    println("5. Calculate the tangent of an angle")
    val decision = readLine()!!.toInt()
    when (decision) {
        1 -> {
            println("Enter the number of degrees:")
            val deg = readLine()!!.toDouble()
            val rad = degToRad(deg)
            println("$deg degrees is equal to $rad radians.")
        }
        2 -> {
            println("Enter the number of radians:")
            val rad = readLine()!!.toDouble()
            val deg = radToDeg(rad)
            println("$rad radians is equal to $deg degrees.")
        }
        3 -> {
            println("Enter the angle:")
            val angle = readLine()!!.toDouble()
            val sine = sin(angle)
            println("The sine of $angle is $sine.")
        }
        4 -> {
            println("Enter the angle:")
            val angle = readLine()!!.toDouble()
            val cosine = cos(angle)
            println("The cosine of $angle is $cosine.")
        }
        5 -> {
            println("Enter the angle:")
            val angle = readLine()!!.toDouble()
            val tangent = tan(angle)
            println("The tangent of $angle is $tangent.")
        }
    }
}
