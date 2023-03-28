package poo.associacao;

import java.util.ArrayList;

public class Pessoa {
    String nome;
    ArrayList<Automovel> automoveis = 
            new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomovel(Automovel automovel) {
        this.automoveis.add(automovel);
        automovel.setDono(this);
    }
    
    
}
