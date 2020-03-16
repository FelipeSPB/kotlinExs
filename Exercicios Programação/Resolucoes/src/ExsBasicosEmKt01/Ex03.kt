package ExsBasicosEmKt01;

import java.util.Scanner;

fun main(args: Array<String>) {
    print("Digite seu saldo: ")
    val input = Scanner(System.`in`)
    var saldo:Double = input.nextDouble();
    val reajuste = saldo * 0.01;
    saldo+=reajuste;
    println("Seu salário com o reajuste será de: R$$saldo")
}