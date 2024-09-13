package br.edu.unisep.model;

public class Inscricao {
    private Participante participante;
    private Sessao sessao;

    public Inscricao(Participante participante, Sessao sessao) {
        this.participante = participante;
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return participante.getNome() + " está inscrito em " + sessao.toString();
    }
}
