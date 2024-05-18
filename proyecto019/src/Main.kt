//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese primer número: ")
    val numero1 = readln().toInt()
    print("Ingrese segundo número: ")
    val numero2 = readln().toInt()
    print("Ingrese tercer número: ")
    val numero3 = readln().toInt()

    val mayor = if ( numero1 > numero2){
        if (numero1 > numero3){
            numero1
        }else{
            numero3
        }
    }else{
        if(numero2>numero3){
            numero2
        }else{
            numero3
        }
    }
    println("EL numero mayor es $mayor")
}
