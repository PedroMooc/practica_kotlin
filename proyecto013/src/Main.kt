//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese la califación 1: ")
    val cal1 = readln().toDouble()
    print("Ingrese la califación 2: ")
    val cal2 = readln().toDouble()
    print("Ingrese la califación 3: ")
    val cal3 = readln().toDouble()

    val promedio = (cal1 + cal2 + cal3)/3

    if (promedio >= 7)
        print("Promocionado")
}