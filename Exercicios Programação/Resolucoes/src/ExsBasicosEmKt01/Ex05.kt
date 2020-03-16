package ExsBasicosEmKt01

import java.util.Scanner
import kotlin.math.round

fun main(args: Array<String>) {

    print("Digite seu salário: ")
    val input = Scanner(System.`in`)
    val salario:Double = input.nextDouble();
    val salarioMinimo = 788.00
    val qtdSalariosMinimos:Double = round((salario/salarioMinimo))
    println("Você recebe $qtdSalariosMinimos Salarios Minimos.")
}