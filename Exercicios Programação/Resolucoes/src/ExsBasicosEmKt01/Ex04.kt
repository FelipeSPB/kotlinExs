package ExsBasicosEmKt01

import java.util.*

class Peca(val pecaCod: Int, var preco: Double){
}

fun  calcularPreco(preco: Double,quantidade: Int):Double {
    return (preco*quantidade);
}

fun main(args: Array<String>) {
    print("Digite a porcentagem do IPI: ")
    val input = Scanner(System.`in`)
    var Ipi = input.nextInt();
    var peca1 = Peca(1,30.0);
    var peca2 = Peca(2,40.0);
    val totalVenda = (calcularPreco(peca1.preco,1) + calcularPreco(peca2.preco,1))*(Ipi/100+1)
    println("O total da venda foi: R$$totalVenda")
}