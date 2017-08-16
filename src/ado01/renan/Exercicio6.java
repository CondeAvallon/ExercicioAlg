package ado01.renan;

public class Exercicio6 {

    public static void main(String[] args) {
        int[][] tabuada = criarMatriz();
        popularMatriz(tabuada);
        exibeTabuada(tabuada);
    }

    //funcao para criar a matriz
    public static int[][] criarMatriz() {
        int[][] tabuada = new int[10][10];
        return tabuada;
    }

    //funcao para definir valores dentro da matriz
    public static void popularMatriz(int[][] tabuada) {
        for (int i = 1; i < tabuada.length; i++) {
            for (int j = 1; j < tabuada[i].length; j++) {
                tabuada[i][j] = i * j;
            }
        }
    }

    //funcao que exibe a tabuada do 1 a 9 em tabela
    public static void exibeTabuada(int[][] tabuada) {
        System.out.println("TABUADA DO 1 AO 9\n");
        for (int i = 1; i < tabuada.length; i++) {
            for (int j = 1; j < tabuada[i].length; j++) {
                System.out.print(tabuada[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
