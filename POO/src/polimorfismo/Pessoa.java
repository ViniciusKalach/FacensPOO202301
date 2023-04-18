package polimorfismo;

/**
 *
 * @author edson
 */
public class Pessoa {
    public double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    /*
    public void comerCarne(Carne c){
        this.peso +=c.getPeso();
    }
    public void comerSalada(Salada s){
        this.peso += s.getPeso();
    }
    public void comerSorvete(Sorvete so){
        this.peso += so.getPeso();
    }
    */
    public void comer(Comida c){
        this.peso += c.getPeso();
    }
}
