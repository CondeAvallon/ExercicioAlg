package ado01;

import java.util.Scanner;

public class ListaNomes {

    public static void main(String[] args) {
        String[] listaNomes = criarListaNomes();
        menu(listaNomes);
    }

    //criacao do vetor utilizado para armazenar nomes
    public static String[] criarListaNomes() {
        String[] listaNomes = new String[50];
        return listaNomes;
    }

    //menu que da opcao ao usuario de escolher o que fazer
    public static void menu(String[] listaNomes) {
        boolean sair = false;
        Scanner console = new Scanner(System.in);
        System.out.println("=== PROGRAMA DE CADASTRO DE NOMES ===\n");
        //o laco de repeticao soh eh quebrado quando o usuario escolher a opcao 0 - sair
        while (sair == false) {
            try {
                System.out.println("\n=== MENU ===\n");
                System.out.println("1 - Cadastro de Nomes");
                System.out.println("2 - Apresentar os Nomes");
                System.out.println("3 - Pesquisar um Nome");
                System.out.println("4 - Remover um Nome");
                System.out.println("0 - Sair\n");
                int menu = Integer.parseInt(console.nextLine());
                //switch case para escolher qual a opcao desejada pelo usuario
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
            } catch (NumberFormatException numEx) {
                System.err.println("Entrada inválida!");
            } catch (Exception ex) {
                System.out.println("Erro!");
            }
        }
    }

    //funcao com o objetivo de cadastrar nomes no vetor
    public static void cadastrarNomes(String[] listaNomes) {
        Scanner console = new Scanner(System.in);
        System.out.print("\nDigite o nome a ser cadastrado: ");
        String nome = console.nextLine();
        if (nome.equals("")) {
            System.out.println("\n** Entrada inválida. **");
            return;
        }
        nome = nome.toUpperCase();
        for (int i = 0; i < listaNomes.length; i++) {
            //quando o laco encontra um elemento nulo, cadastra o nome em seu lugar
            if (listaNomes[i] == null) {
                listaNomes[i] = nome;
                System.out.println("\n** Nome " + nome + " cadastrado com sucesso. **");
                break;
                /*se a ultima posicao do vetor nao estiver null, aparece uma mensagem 
                informando que a lista esta cheia
                */
            } else if (listaNomes[(listaNomes.length - 1)] != null) {
                System.out.println("\n** A lista está cheia! **");
                break;
                /*se o laco encontra um elemento que ja contem o nome digitado,
                aparece uma mensagem informando que o nome ja esta cadastrado
                */
            } else if (listaNomes[i].equals(nome)) {
                System.out.println("\n** Este nome já está cadastrado! **");
                break;
            }
        }
    }

    //apresenta todos os nomes contidos na lista, nao incluindo aspas vazias e nulls
    public static void apresentarNomes(String[] listaNomes) {
        System.out.println("");
        System.out.println("=== NOMES DA LISTA ===\n");
        for (int i = 0; i < listaNomes.length; i++) {
            if (listaNomes[i] != null) {
                System.out.println("Nome[" + (i + 1) + "]: " + listaNomes[i]);
            } else if (listaNomes[0] == null) {
                System.out.println("** Lista de nomes vazia! **");
                break;
            }
        }
    }

    //pesquisa um nome especifico dentro do vetor
    public static void pesquisarNomes(String[] listaNomes) {
        Scanner console = new Scanner(System.in);
        System.out.println("");
        System.out.print("Digite o nome a ser pesquisado: ");
        String nome = console.nextLine();
        nome = nome.toUpperCase();
        for (int i = 0; i < listaNomes.length; i++) {
            //se achar o nome digitado, aparecera em qual posicao ele se encontra
            if (nome.equals(listaNomes[i])) {
                System.out.println("\n** Nome " + nome + " consta na lista, na posição [" + (i + 1) + "]. **");
                break;
                /*se o laco nao encontrar o nome e chegar em um null, aparecera uma 
                mensagem informando que o nome nao foi encontrado
                */
            } else if (listaNomes[i] == null) {
                System.out.println("\n **O nome não consta na lista! **");
                break;
            }
        }
    }

    //exclui um nome do vetor
    public static void removerNomes(String[] listaNomes) {
        boolean nomeDeletado = false;
        Scanner console = new Scanner(System.in);
        System.out.println("");
        System.out.print("Digite o nome a ser removido: ");
        String nome = console.nextLine();
        nome = nome.toUpperCase();
        for (int i = 0; i < listaNomes.length; i++) {
            if (nome.equals(listaNomes[i])) {
                System.out.println("\n** Nome removido: " + nome.toUpperCase() + " **");
                for (int j = i; j < listaNomes.length; j++) {
                    /*se o nome nao estiver contido na ultima posicao, ele eh
                    substituido pelo elemento da proxima posicao
                    */
                    if (j != (listaNomes.length - 1)) {
                        listaNomes[j] = listaNomes[j + 1];
                        /*se estiver na ultima posicao, ele apenas eh substituido
                        por null
                        */
                    } else {
                        listaNomes[j] = null;
                    }
                }
                nomeDeletado = true;
            } else if (nomeDeletado = false) {
                System.out.println("\n** Este nome não consta na lista. **");
                break;
            }
        }

    }

}
