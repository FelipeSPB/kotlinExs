package ExsBasicosEmKt01

import java.util.Scanner

fun main(args: Array<String>) {
    print("Digite um número inteiro: ")
    val input = Scanner(System.`in`)
    val numero:Int = input.nextInt();
    val sucessor = numero+1;
    val antecessor = numero-1;
    print("Você digitou: $numero\nO antecessor: $antecessor\nO sucessor: $sucessor")
}