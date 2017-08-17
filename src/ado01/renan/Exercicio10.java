
package ado01.renan;

import java.util.Scanner;

public class Exercicio10 {
    
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        int tamanhoMatriz = obterTamanhoMatriz();
        int [][] matriz1 = construirMatriz(tamanhoMatriz);
        int [][] matriz2 = construirMatriz(tamanhoMatriz);
        populaMatriz(matriz1,1);
        populaMatriz(matriz2,2);
        int [][] somaDasMatrizes = somarMatrizes(matriz1,matriz2);
        exibeMatriz(somaDasMatrizes);
    }
    
    public static int obterTamanhoMatriz(){
        System.out.println("Qual o tamanho das matrizes?");
        int tamanhoMatriz = Integer.parseInt(console.nextLine());
        return tamanhoMatriz;
    }
    
    public static int [][] construirMatriz(int tamanho){
        int [][] matriz = new int [tamanho][tamanho];
        return matriz;
    }
    
    public static void populaMatriz (int [][] matriz, int qualMatriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("Qual o valor do índice [" + i + "][" + j + "]? - Matriz " + qualMatriz +": ");
                matriz[i][j] = Integer.parseInt(console.nextLine());
            }
        }
        System.out.println("");
    }
    
    public static int [][] somarMatrizes(int [][] matriz1, int [][] matriz2){
        int [][] somaDasMatrizes = new int [matriz1.length][matriz1.length];
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                somaDasMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return somaDasMatrizes;
    }
    
    public static void exibeMatriz (int [][] matriz){
        System.out.println("=== SOMA DAS MATRIZES ===\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
