package br.edu.unisep.model;

import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private String titulo;
    private String horario;
    private List<Palestrante> palestrantes = new ArrayList<>();

    public Sessao(String titulo, String horario) {
        this.titulo = titulo;
        this.horario = horario;
    }

    public void addPalestrante(Palestrante palestrante) {
        palestrantes.add(palestrante);
    }

    public List<Palestrante> getPalestrantes() {
        return palestrantes;
    }

    @Override
    public String toString() {
        return titulo + " das " + horario;
    }
}
