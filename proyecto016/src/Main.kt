//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese un valor entero:")
    val valor =  readln().toInt()
    val resultado = if (valor % 2 == 0) {
        print("Cuadrado: ")
        valor * valor
    }else{
        print("Cubo: ")
        valor * valor * valor
    }
    print(resultado)
}