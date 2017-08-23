
package ado01.renan;

import java.util.Scanner;

public class Exercicio4 {
    
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        int media = obterMedia();
        mostraResultado(media);
    }
    
    public static int obterMedia(){
        System.out.println("=== PROGRAMA DE CÁLCULO DE MÉDIA ===\n");
        int soma = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Número [" + (i+1) + "]: ");
            int numero = Integer.parseInt(console.nextLine());
            soma += numero;
        }
        int media = soma / 5;
        System.out.println("\nMédia: " + media);
        return media;
    }
    
    public static void mostraResultado (int media){
        if (media < 5){
            System.out.println("REPROVADO.");
        } else if (media >= 5 && media < 9){
            System.out.println("APROVADO.");
        } else if (media == 9){
            System.out.println("PARABÉNS.");
        } else if (media == 10){
            System.out.println("MASTER OF THE UNIVERSE.");
        } else {
            System.out.println("NOTA INVÁLIDA.");
        }
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }
    
}
