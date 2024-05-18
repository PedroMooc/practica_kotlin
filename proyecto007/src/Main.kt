//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese el precio del producto: ")
    val precio = readln().toFloat()
    print("Ingrese la cantidad de productos: ")
    val cantidad = readln().toInt()

    val total = precio * cantidad
    println("El total a pagar es $total")
}