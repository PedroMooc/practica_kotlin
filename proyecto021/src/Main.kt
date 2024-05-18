//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese la catidad de preguntas: ")
    val preguntas = readln().toInt()
    print("Ingrese la catidad de aciertos: ")
    val aciertos = readln().toInt()

    val porcentaje = (aciertos * 100) / preguntas

    val nivel = if (porcentaje>=90) "máximo" else if (porcentaje >= 75) "medio" else if(porcentaje>=50) "regular" else "Fuera de Nivel"

    print("Su nivel es: $nivel")
}