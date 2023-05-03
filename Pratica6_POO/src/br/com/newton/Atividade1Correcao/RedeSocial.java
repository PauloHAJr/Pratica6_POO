package br.com.newton.Atividade1Correcao;

import java.util.AbstractList;
import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao,nomeUsuario,dataNascimento,senha;
    AbstractList<Publicacao> publicacaos = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    void inserePublicacao(Publicacao publi){
        publicacaos.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("Total de publicações: "+Publicacao.getContadorPublicacao());
        for(int i=0;i<publicacaos.size();i++){
            System.out.println("Data da publicação: "+publicacaos.get(i).getDataPublicacao());
            System.out.println("Texto da publicação: "+publicacaos.get(i).getTextoPublicacao());
        }
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
