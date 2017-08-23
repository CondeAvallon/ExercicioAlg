package ado01.renan;

import java.util.Scanner;

public class Exercicio1 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        float numero = obterNumero();
        boolean maiorQueCinquenta = verificaNumero(numero);
        mostraMensagem(maiorQueCinquenta);

    }

    public static float obterNumero() {
        System.out.println("=== PROGRAMA DE VERIFICAÇÃO NUMERAL ===\n");
        System.out.print("Digite um número decimal: ");
        float numero = Float.parseFloat(console.nextLine());
        return numero;
    }

    public static boolean verificaNumero(float numero) {
        if (numero >= 50.0) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostraMensagem(boolean maiorQue) {
        if (maiorQue == true) {
            System.out.println("\nSUCESSO!");
        } else {
            System.out.println("\nERRO!");
        }
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }

}
