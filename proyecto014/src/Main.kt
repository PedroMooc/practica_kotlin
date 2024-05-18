//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese un numero entero entre 1 y 99: ")
    val numero = readln().toInt()
    if (numero>9){
        println("El numero tiene dos digitos")
    }else{
        println("El numero tiene un digito")
    }
}