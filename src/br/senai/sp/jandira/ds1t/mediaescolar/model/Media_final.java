package br.senai.sp.jandira.ds1t.mediaescolar.model;

import java.util.Scanner;

public class Media_final {

    String nomeDoAluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double SomatoriaNotas;
    double mediaFinal;
    String aprovadoXreprovado;

    public void receberDados(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------");
        System.out.print("Digite o nome do Aluno:");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Digite a primeira nota:");
        nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota:");
        nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota:");
        nota3 = leitor.nextDouble();

        System.out.print("Digite a quarta nota:");
        nota4 = leitor.nextDouble();
        System.out.println("------------------------------------------------------------");

        calcularMedia();
    }
    public void calcularMedia() {
        SomatoriaNotas = nota1 + nota2 + nota3 + nota4;
        mediaFinal = SomatoriaNotas / 4;

        determinarSituacao();
    }

    public void determinarSituacao(){
            if (mediaFinal >= 5.0) {
                aprovadoXreprovado = "Aprovado(a)";
            } else {
                aprovadoXreprovado = "Reprovado(a)";
            }

            exibirResultados();
        }

    public void exibirResultados(){
        System.out.println("Média do aluno(a): " + mediaFinal );
        System.out.println("O(a) aluno(a) " + nomeDoAluno + " está " + aprovadoXreprovado + "!");
        System.out.println("------------------------------------------------------------------");
    }











}
