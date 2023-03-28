package poo;

/**
 *
 * @author edson
 */
public class Comparacao {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        System.out.println(x == y);
        String n1 = "Edson";
        String n2 = "Edson";
        System.out.println(n1 == n2);
        Pessoa p1 = new Pessoa();
        p1.setNome("Victor");
        Pessoa p2 = new Pessoa();
        p2.setNome("victor");
        System.out.println(p1.equals(p2));

    }
}
