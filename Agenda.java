package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;
    private int tamanho;

    public Agenda() {
        this.contatos = new ArrayList<>();
        this.tamanho = 0;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        tamanho++;
    }

    public boolean removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(contato);
                tamanho--;
                return true;
            }
        }
        return false;
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public Contato buscarContatoPorEmail(String email) {
        for (Contato contato : contatos) {
            if (contato.getEmail().equalsIgnoreCase(email)) {
                return contato;
            }
        }
        return null;
    }

    public Contato buscarContatoPorTelefone(long telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone() == telefone) {
                return contato;
            }
        }
        return null;
    }
}
