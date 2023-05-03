package br.com.newton.Atividade1Correcao;

import javax.swing.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        String dataCriacao = JOptionPane.showInputDialog("Digite a data de Criação da Rede Social");
        String nomeUsuario = JOptionPane.showInputDialog("Digite o nome do Usuário");
        String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
        String senha = JOptionPane.showInputDialog("Digite a senha");
        RedeSocial redeSocial = new RedeSocial(dataCriacao,nomeUsuario,dataNascimento,senha);

        Publicacao publi1;
        ArrayList<Publicacao> publi = new ArrayList<>();
        for (int i=0;i<3;i++) {
            String dataPublicacao = JOptionPane.showInputDialog("Digite a data da publicação: ");
            String textoPublicacao = JOptionPane.showInputDialog("Digite o texto da publicação: ");
            String linkMidia = JOptionPane.showInputDialog("Digite o link da publicação: ");
            publi1 = new Publicacao(dataPublicacao,textoPublicacao,linkMidia);
            publi.add(publi1);//adiciona o objeto no arraylist
            redeSocial.inserePublicacao(publi1);//adiciona o objeto na rede social//tambem pode ser usado publi.get(i)
        }
        redeSocial.imprimePublicacoes();
    }
}
