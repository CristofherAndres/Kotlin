//Uso de aritmetica
//Errores tipicos

fun main() {

    var num1:Float = 1.5f
    var num2:Int = 2
    var resultado1:Int = num1+num2
    
    //No funciona
    print("Suma: ")
    println(resultado1)
    
    var resultado2:Int = num1.toInt() + num2
    print("Suma: ")
    println(resultado2)
    
}