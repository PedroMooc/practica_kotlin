//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese el sueldo del empleado: ")
    val sueldo = readln().toDouble()
    if (sueldo > 3000){
        println("Debe pagar impuestos")
    }
}