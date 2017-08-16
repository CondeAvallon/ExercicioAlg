package ado01.renan;

import java.util.Scanner;

public class Exercicio7 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdAlunos = obterQtdAlunos();
        float[] notas = obterNotas(qtdAlunos);
        calcularMedia(notas);
    }

    //recebe a quantidade de alunos que tem na sala
    public static int obterQtdAlunos() {
        System.out.print("Digite a quantidade de alunos na sala: ");
        int qtdAlunos = Integer.parseInt(console.nextLine());
        return qtdAlunos;
    }

    //funcao para que o usuario coloque no programa as notas dos alunos
    public static float[] obterNotas(int qtdAlunos) {
        float[] notas = new float[qtdAlunos];
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Digite a nota do aluno [" + (i + 1) + "]: ");
            notas[i] = Integer.parseInt(console.nextLine());
        }
        return notas;
    }

    //funcao que calcula a media das notas da sala
    public static void calcularMedia(float[] notas) {
        float soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        float media = soma / notas.length;
        System.out.println("A média da sala é: " + media);
    }
}
