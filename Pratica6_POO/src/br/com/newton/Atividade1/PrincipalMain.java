package br.com.newton.Atividade1;

import java.util.Scanner;

public class PrincipalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome da rede social desejada? ");
        String nomeRedeSocial = sc.nextLine();
        System.out.println("Em qual ano ela foi fundada? ");
        int anoFundacao = sc.nextInt();

        RedeSocial redeSocial = new RedeSocial(nomeRedeSocial, anoFundacao);

        System.out.println("Primeira publicação: ");
        System.out.println("Digite o texto da publicação: ");
        String textoPublicacao = sc.next();
        System.out.println("Digite o link da publicação: ");
        String linkMidia = sc.next();
        System.out.println("Digite a data da publicação: ");
        String dataPublicacao = sc.next();
        Publicacao publicacao1 = new Publicacao(textoPublicacao, linkMidia, dataPublicacao);
        redeSocial.inserePublicacao(publicacao1);

        System.out.println("Segunda publicação: ");
        System.out.println("Digite o texto da publicação: ");
        String textoPublicacao2 = sc.next();
        System.out.println("Digite o link da publicação: ");
        String linkMidia2 = sc.next();
        System.out.println("Digite a data da publicação: ");
        String dataPublicacao2 = sc.next();
        Publicacao publicacao2 = new Publicacao(textoPublicacao, linkMidia, dataPublicacao);
        redeSocial.inserePublicacao(publicacao2);

        redeSocial.imprimePublicacoes();
    }
}