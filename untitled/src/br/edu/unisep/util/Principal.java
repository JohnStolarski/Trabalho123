package br.edu.unisep.util;

import br.edu.unisep.model.*;

public class Principal {
    public static void main(String[] args) {
        // Criando palestrantes
        Palestrante palestrante1 = new Palestrante("Dr. Ana Souza");
        Palestrante palestrante2 = new Palestrante("Prof. João Lima");

        // Criando sessões
        Sessao sessao1 = new Sessao("Inovações em Tecnologia", "10:00 - 11:00");
        Sessao sessao2 = new Sessao("Tendências em IA", "11:15 - 12:15");

        sessao1.addPalestrante(palestrante1);
        sessao2.addPalestrante(palestrante2);

        // Criando um evento
        Evento evento = new Evento("Conferência de Tecnologia", "15/10/2024", "Centro de Convenções");

        // Adicionando sessões ao evento
        evento.addSessao(sessao1);
        evento.addSessao(sessao2);

        // Criando participantes
        Participante participante1 = new Participante("Lucas Almeida");
        Participante participante2 = new Participante("Mariana Costa");

        // Criando inscrições
        Inscricao inscricao1 = new Inscricao(participante1, sessao1);
        Inscricao inscricao2 = new Inscricao(participante2, sessao2);

        // Exibindo informações
        System.out.println(evento);
        System.out.println("Sessões:");
        for (Sessao sessao : evento.getSessoes()) {
            System.out.println(" - " + sessao);
            System.out.print("   Palestrantes: ");
            for (Palestrante palestrante : sessao.getPalestrantes()) {
                System.out.print(palestrante.getNome() + " ");
            }
            System.out.println();
        }
        System.out.println("Inscrições:");
        System.out.println(inscricao1);
        System.out.println(inscricao2);
    }
}

