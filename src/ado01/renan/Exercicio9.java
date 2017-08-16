package ado01.renan;

import java.util.Scanner;

public class Exercicio9 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String[] aulas = definirAulas();
        exibeAulas(aulas);
    }

    public static String[] definirAulas() {
        System.out.println("=== PROGRAMA DE CONSULTA DE AULAS ===\n");
        String[] aulas = new String[10];
        System.out.println("Digite duas aulas para cada dia semana!\n");
        for (int i = 0; i < aulas.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Segunda:");
                    aulas[i] = console.nextLine();
                    aulas[i + 1] = console.nextLine();
                    break;
                case 1:
                    System.out.println("\nTerca:");
                    aulas[i + 1] = console.nextLine();
                    aulas[i + 2] = console.nextLine();
                    break;
                case 2:
                    System.out.println("\nQuarta:");
                    aulas[i + 2] = console.nextLine();
                    aulas[i + 3] = console.nextLine();
                    break;
                case 3:
                    System.out.println("\nQuinta:");
                    aulas[i + 3] = console.nextLine();
                    aulas[i + 4] = console.nextLine();
                    break;
                case 4:
                    System.out.println("\nSexta:");
                    aulas[i + 4] = console.nextLine();
                    aulas[i + 5] = console.nextLine();
                    break;
            }
        }
        return aulas;
    }

    public static void exibeAulas(String[] aulas) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\nDigite o dia da semana para consulta ou sair!");
            String diaDaSemana = console.nextLine();
            diaDaSemana = diaDaSemana.toUpperCase();
            if (diaDaSemana.equals("SAIR")) {
                System.out.println("=== SISTEMA FECHADO ===");
                break;
            }
            System.out.println("\nAulas:");
            switch (diaDaSemana) {
                case "SEGUNDA":
                    System.out.println(aulas[0]);
                    System.out.println(aulas[1]);
                    break;
                case "TERCA":
                    System.out.println(aulas[2]);
                    System.out.println(aulas[3]);
                    break;
                case "QUARTA":
                    System.out.println(aulas[4]);
                    System.out.println(aulas[5]);
                    break;
                case "QUINTA":
                    System.out.println(aulas[6]);
                    System.out.println(aulas[7]);
                    break;
                case "SEXTA":
                    System.out.println(aulas[8]);
                    System.out.println(aulas[9]);
                    break;
                default:
                    System.out.println("Entrada inválida!");
            }
        }
    }

}
