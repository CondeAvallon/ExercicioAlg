package ado01.renan;

import java.util.Scanner;

public class Exercicio8 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdNumeros = obterQtdNumero();
        int[] numeros = obterNumeros(qtdNumeros);
        identificarMaior(numeros);
    }

    //funcao que obtem um numero do usuario
    public static int obterQtdNumero() {
        System.out.println("=== PROGRAMA DE VERIFICAÇÃO NUMERAL ===\n");
        System.out.print("Digite a quantidade de números desejada: ");
        int qtd = Integer.parseInt(console.nextLine());
        System.out.println("");
        return qtd;
    }

    //funcao que obtem os valores digitados pelo usuario
    public static int[] obterNumeros(int qtdNumeros) {
        int[] numeros = new int[qtdNumeros];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor do índice [" + (i + 1) + "]: ");
            numeros[i] = Integer.parseInt(console.nextLine());
        }
        return numeros;
    }

    //funcao que identifica o maior numero e em qual rodada ele foi digitado
    public static void identificarMaior(int[] numeros) {
        int maiorNumero = 0;
        int rodada = 1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                rodada += i;
            }
        }
        System.out.println("\nO maior número é: " + maiorNumero + ", identificado na rodada: " + rodada + ".");
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }

}
