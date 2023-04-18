package abstrato;

/**
 *
 * @author edson
 */
public class AulaAbstrato {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        System.out.println(c.mover());
        System.out.println(c.mamar());
        System.out.println(c.latir());
    }
}
