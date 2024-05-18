//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese un valor entero entre 1 y 99: ")
    val valor = readln().toInt()
    val digitos = if(valor > 9){
        2
    }else{
        1
    }
    println("El numero tiene $digitos digitos")
}