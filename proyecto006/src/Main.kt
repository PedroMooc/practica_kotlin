//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   print("Ingrese la medida del lado del cuadrado: ")
   val lado = readln().toInt()
   val perimetro = lado * 4
   println("El perimetro del cuadrado es $perimetro")
}