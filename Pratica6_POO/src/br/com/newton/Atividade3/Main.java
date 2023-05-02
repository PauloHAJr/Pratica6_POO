package br.com.newton.Atividade3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Artigo> artigos = new ArrayList<>();

        Edicao edicao = new Edicao(1, 1, "25/09/2018", 5000);
        for (Artigo artigo : artigos) {
            edicao.adicionarArtigo(artigo);
        }

        RevistaCientifica revista = new RevistaCientifica("Revista Científica",999999999, "Mensal");
        revista.adicionarEdicao(edicao);
    }
}
