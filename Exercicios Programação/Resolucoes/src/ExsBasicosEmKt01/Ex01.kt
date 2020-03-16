package ExsBasicosEmKt01;
import java.util.Scanner;
fun main(args: Array<String>){
    print("Digite sua idade em Anos, Meses e Dias: ")
    val input = Scanner(System.`in`);
    val ano:Int = input.nextInt();
    val mes:Int = input.nextInt();
    val dias:Int = input.nextInt();
    val totalEmDias:Int = (ano*365) + (mes*30) + dias;
    println("Sua idade em dias: $totalEmDias");



}