package ado01.renan;

import java.util.Scanner;

public class Exercicio2 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        float numero = obterNumero();
        verificaParOuImpar(numero);
        verificaPrimo (numero);
    }

    public static float obterNumero() {
        
        System.out.println("=== PROGRAMA DE VERIFICAÇÃO NUMERAL ===\n");
        
        float numero = 0;
        boolean valida = false;
        
        while (valida == false) {
            try {
                System.out.print("Digite um número: ");
                numero = Float.parseFloat(console.nextLine());
                valida = true;
            } catch (Exception ex) {
                System.err.println("Não é um número.");

            }

        }
        return numero;
    }
    
    public static void verificaParOuImpar (float numero){
        if (numero % 2 == 0){
            System.out.println("\nO número " + numero + " é par.");
        } else {
            System.out.println("\nO número " + numero + " é ímpar.");
        }
    }
    
    public static void verificaPrimo (float numero){
        int soma = 0;
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                soma += 1;
            }
        }
        if (soma == 2){
            System.out.println("O número " + numero + " é primo.\n");
        } else {
            System.out.println("O número " + numero + " não é primo.\n");
        }
        System.out.println("=== FIM DO PROGRAMA ===");
    }

}
