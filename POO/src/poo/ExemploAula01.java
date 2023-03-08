package poo;

public class ExemploAula01 {


    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        //p.nome = "Edson";
        p.setNome("Edson");
        p.telefone = "(15) 121212";
        Pessoa p2 = new Pessoa();
        //p2.nome = "Mateus";
        p2.setNome("Mateus");
        //p.ResponderONome();
        //p2.ResponderONome();
        //p.PerguntarONome(p2);
        //System.out.println(p.ResponderONome());
        p.PerguntarONome(p2);
        System.out.println(p.PerguntarONome(p2));
    }
    
}
