package poo;

import java.util.Objects;

public class Pessoa {
    private String nome;
    public String telefone;
    public String rg;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.telefone);
        hash = 79 * hash + Objects.hashCode(this.rg);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return Objects.equals(this.rg, other.rg);
    }
    
    
    
    public String PerguntarONome(Pessoa p2){
        //System.out.println("Qual é o seu nome?");
        //System.out.println("Meu nome é "+p.nome);
        //p.ResponderONome();
        String retorno = "";
        retorno += "Qual é o seu nome?\n";
        retorno += p2.ResponderONome();
        return retorno;
    }
    public String ResponderONome(){
        //System.out.println("Meu nome é "+nome);
        return "Meu nome é "+nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
