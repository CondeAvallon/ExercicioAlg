package ado01;

import java.util.Scanner;

public class ListaNomes {

    public static void main(String[] args) {
        String[] listaNomes = criarListaNomes();
        menu(listaNomes);
    }

    public static String[] criarListaNomes() {
        String[] listaNomes = new String[3];
        return listaNomes;
    }

    public static void menu(String[] listaNomes) {
        boolean sair = false;
        Scanner console = new Scanner(System.in);
        System.out.println("=== PROGRAMA DE CADASTRO DE NOMES ===\n");
        while (sair == false) {
            try {
                System.out.println("\n=== MENU ===\n");
                System.out.println("1 - Cadastro de Nomes");
                System.out.println("2 - Apresentar os Nomes");
                System.out.println("3 - Pesquisar um Nome");
                System.out.println("4 - Remover um Nome");
                System.out.println("0 - Sair\n");
                int menu = Integer.parseInt(console.nextLine());
                switch (menu) {
                    case 1:
                        cadastrarNomes(listaNomes);
                        break;
                    case 2:
                        apresentarNomes(listaNomes);
                        break;
                    case 3:
                        pesquisarNomes(listaNomes);
                        break;
                    case 4:
                        removerNomes(listaNomes);
                        break;
                    case 0:
                        System.out.println("\n=== FIM DO PROGRAMA ===");
                        sair = true;
                        break;
                    default:
                        System.out.println("\nOpção inválida.");
                        break;
                }
            } catch (NumberFormatException ex) {
                System.err.println("Entrada inválida!");
            } catch (Exception ex) {
            }
        }
    }

    public static void cadastrarNomes(String[] listaNomes) {
        Scanner console = new Scanner(System.in);
        System.out.print("\nDigite o nome desejado: ");
        String nome = console.nextLine();
        if (nome.equals("")) {
            System.out.println("\n** Entrada inválida. **");
            return;
        }
        nome = nome.toUpperCase();
        for (int i = 0; i < listaNomes.length; i++) {
            if (listaNomes[i] == null) {
                listaNomes[i] = nome;
                break;
            } else if (listaNomes[(listaNomes.length-1)] != null) {
                System.out.println("\n** A lista está cheia! **");
                break;
            } else if (listaNomes[i].equals(nome)) {
                System.out.println("\n** Este nome já está cadastrado! **");
                break;
            } 
        }
    }

    public static void apresentarNomes(String[] listaNomes) {
        System.out.println("");
        for (int i = 0; i < listaNomes.length; i++) {
            if (listaNomes[i] != null) {
                System.out.println("Nome[" + (i + 1) + "]: " + listaNomes[i]);
            } else if (listaNomes[0] == null) {
                System.out.println("** Lista de nomes vazia! **");
                break;
            }
        }
    }

    public static void pesquisarNomes(String[] listaNomes) {
        Scanner console = new Scanner(System.in);
        System.out.println("");
        System.out.print("Digite o nome a ser pesquisado: ");
        String nome = console.nextLine();
        nome = nome.toUpperCase();
        for (int i = 0; i < listaNomes.length; i++) {
            if (nome.equals(listaNomes[i])) {
                System.out.println("\nNome consta na lista, na posição [" + (i + 1) + "].");
                break;
            } else if (listaNomes[i] == null) {
                System.out.println("\n **O nome não consta na lista! **");
                break;
            }
        }
    }

    public static void removerNomes(String[] listaNomes) {
        Scanner console = new Scanner(System.in);
        System.out.println("");
        System.out.print("Digite o nome a ser removido: ");
        String nome = console.nextLine();
        nome = nome.toUpperCase();
        for (int i = 0; i < listaNomes.length; i++) {
            System.out.println(listaNomes[i]);
            if (nome.equals(listaNomes[i])) {
                System.out.println("\nNome removido: " + nome.toUpperCase());
                for (int j = i; j < listaNomes.length; j++) {
                    if (listaNomes[j] == listaNomes[(listaNomes.length-1)]){
                        listaNomes[j] = null;
                    }
                    listaNomes[j] = listaNomes[j + 1];
                }
            } else if (listaNomes[i] == null) {
                System.out.println("\n** Este nome não consta na lista. **");
                break;
            }
        }

    }

}
