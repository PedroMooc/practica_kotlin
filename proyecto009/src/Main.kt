//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese el numero 1: ")
    val numero1 = readln().toFloat()
    print("Ingrese el numero 2: ")
    val numero2 = readln().toFloat()
    print("Ingrese el numero 3: ")
    val numero3 = readln().toFloat()
    print("Ingrese el numero 4: ")
    val numero4 = readln().toFloat()

    val suma = numero1 + numero2 + numero3 +  numero4
    val promedio = suma / 4

    println("La suma de $numero1, $numero2, $numero3 y $numero4 es $suma")
    println("El promedio es $promedio")
}