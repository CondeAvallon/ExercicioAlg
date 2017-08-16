package ado01.renan;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

    static Scanner console = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        int numero = gerarNumeroAleatorio();
        tentarAcertar(numero);
    }

    //função para gerar número aleatório
    public static int gerarNumeroAleatorio() {
        int numero = rnd.nextInt(10) + 1;
        return numero;
    }

    /*função para o usuário tentar acertar o número gerado. caso o usuário digite desistir,
    o programa é fechado.
    */
    public static void tentarAcertar(int numeroAleatorio) {
        boolean acertou = false;
        System.out.println("TENTAR ACERTAR O NÚMERO de 1 a 10 GERADO PELO PROGRAMA!\n");
        while (!acertou) {
            try {
                System.out.print("Digite o número ou digite desistir: ");
                int numero = Integer.parseInt(console.nextLine());
                if (numero == numeroAleatorio) {
                    System.out.println("\nAcertou!");
                    acertou = true;
                } else {
                    System.err.println("Tente novamente!");

                }
            } catch (Exception ex) {
                System.out.println("\nObrigado por jogar!");
                break;
            }
        }

    }

}
