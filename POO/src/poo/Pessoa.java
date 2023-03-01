package poo;

public class Pessoa {
    private String nome;
    public String telefone;
    public String rg;
    
    public String PerguntarONome(Pessoa p){
        //System.out.println("Qual é o seu nome?");
        //System.out.println("Meu nome é "+p.nome);
        //p.ResponderONome();
        String retorno = "";
        retorno += "Qual é o seu nome?\n";
        retorno += p.ResponderONome();
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
