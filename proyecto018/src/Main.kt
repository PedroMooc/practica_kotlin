//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Ingrese primera nota: ")
    val nota1 = readln().toDouble()
    print("Ingrese segunda nota: ")
    val nota2 = readln().toDouble()
    print("Ingrese tercera nota: ")
    val nota3 = readln().toDouble()

    val promedio = (nota1 + nota2 + nota3)/3

    if (promedio >= 7 )
        print("Promocionado")
    else
        if (promedio >=4 )
            print("Regular")
        else
            print("Libre")

}