package polimorfismo;

/**
 *
 * @author edson
 */
public class Restaurante {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setPeso(65);
        System.out.println(p.getPeso());
        Carne c = new Carne();
        c.setPeso(2);
        Salada s = new Salada();
        s.setPeso(0.2);
        Sorvete sor = new Sorvete();
        sor.setPeso(0.350);
        p.comer(c);
        p.comer(s);
        p.comer(sor);
        System.out.println(p.getPeso());
        Macarrao ma = new Macarrao();
        ma.setPeso(2.5);
        p.comer(ma);
    }
}
