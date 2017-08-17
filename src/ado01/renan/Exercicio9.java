package ado01.renan;

import java.util.Scanner;

public class Exercicio9 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String [][] aulas = definirAulas();
        exibeAulas(aulas);
    }
    
    public static String [][] definirAulas (){
        String [][] aulas = new String [5][2];
        System.out.println("=== CRONOGRAMA DE AULAS ===\n");
        System.out.println("Digite duas aulas por dia!");
        for (int i = 0; i < aulas.length; i++){
            System.out.println("");
            for (int j = 0; j < aulas[i].length; j++){
                try{
                switch (i){
                    case 0:
                    System.out.print("Segunda[" + (j+1) + "]: ");
                    aulas[i][j] = console.nextLine();
                    break;
                case 1:
                    System.out.print("Terca[" + (j+1) + "]: ");
                    aulas[i][j] = console.nextLine();
                    break;
                case 2:
                    System.out.print("Quarta[" + (j+1) + "]: ");
                    aulas[i][j] = console.nextLine();
                    break;
                case 3:
                    System.out.print("Quinta[" + (j+1) + "]: ");
                    aulas[i][j] = console.nextLine();
                    break;
                case 4:
                    System.out.print("Sexta[" + (j+1) + "]: ");
                    aulas[i][j] = console.nextLine();
                    break;
            
                }
                }catch (Exception ex){
                    System.out.println("Entrada inválida!");
                }
            }
        }
        return aulas;
    }
    
    public static void exibeAulas(String[][] aulas) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\nDigite o dia da semana para consulta ou digite sair!");
            String diaDaSemana = console.nextLine();
            diaDaSemana = diaDaSemana.toUpperCase();
            if (diaDaSemana.equals("SAIR")) {
                System.out.println("=== SISTEMA FECHADO ===");
                break;
            }
            System.out.println("\nAULAS:");
            switch (diaDaSemana) {
                case "SEGUNDA":
                    System.out.println("1 - " + aulas[0][0]);
                    System.out.println("2 - " + aulas[0][1]);
                    break;
                case "TERCA":
                    System.out.println("1 - " + aulas[1][0]);
                    System.out.println("2 - " + aulas[1][1]);
                    break;
                case "QUARTA":
                    System.out.println("1 - " + aulas[2][0]);
                    System.out.println("2 - " + aulas[2][1]);
                    break;
                case "QUINTA":
                    System.out.println("1 - " + aulas[3][0]);
                    System.out.println("2 - " + aulas[3][1]);
                    break;
                case "SEXTA":
                    System.out.println("1 - " + aulas[4][0]);
                    System.out.println("2 - " + aulas[4][1]);
                    break;
                default:
                    System.err.println("Entrada inválida!");
            }
        }
    }

}
