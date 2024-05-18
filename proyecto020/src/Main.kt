import org.intellij.lang.annotations.PrintFormat

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese un numero enero de hasta 3 digitos")
    val numero = readln().toInt()
    val digitos = if (numero > 999 || numero < -999){
        println("Error, Su número tiene mas de 3 digitos")
        4
    }else{
        if (numero > 99 || numero < -99){
            3
        }else{
            if (numero > 9 || numero < -9){
                2
            }else{
                1
            }
        }
    }
    println("EL numero tiene $digitos cifras")
}