package br.edu.unisep.model;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String data;
    private String local;
    private List<Sessao> sessoes = new ArrayList<>();

    public Evento(String nome, String data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public void addSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    @Override
    public String toString() {
        return nome + " em " + local + " no dia " + data;
    }
}
