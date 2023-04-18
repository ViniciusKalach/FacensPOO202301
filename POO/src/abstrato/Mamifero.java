package abstrato;

public abstract class Mamifero extends Animal{

    public abstract String mover();
    
    public String mamar(){
        return "leite";
    }
    
    public String respirar(){
        return "O2";
    }
}
