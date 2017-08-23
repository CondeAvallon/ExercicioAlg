package ado01.renan;

import java.util.Scanner;

public class Exercicio3 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String numero = obterNumero();
        exibeNumero(numero);
    }

    public static String obterNumero() {
        
        System.out.println("=== PROGRAMA DE TRANSFORMAÇÃO NUMERAL ===\n");

        System.out.print("Digite um número POR EXTENSO de 0 a 9: ");
        String numero = console.nextLine();
        numero = numero.toUpperCase();

        return numero;
    }

    public static void exibeNumero(String numero) {
        System.out.print("\nNumeral: ");
        switch (numero) {
            case "UM":
                System.out.println("1");
                break;
            case "DOIS":
                System.out.println("2");
                break;
            case "TRES":
                System.out.println("3");
                break;
            case "QUATRO":
                System.out.println("4");
                break;
            case "CINCO":
                System.out.println("5");
                break;
            case "SEIS":
                System.out.println("6");
                break;
            case "SETE":
                System.out.println("7");
                break;
            case "OITO":
                System.out.println("8");
                break;
            case "NOVE":
                System.out.println("9");
                break;
            default:
                System.out.println("Entrada inválida.");
                break;
        }
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }

}
