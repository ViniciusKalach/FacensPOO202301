package poo.heranca;

import java.util.ArrayList;
import poo.associacao.Automovel;

/**
 *
 * @author edson
 */
public class AulaHeranca {
    public static void main(String[] args) {
        Fusca f = new Fusca();
        f.setCor("branca");
        f.acelerar();
        f.frear();
        System.out.println(f.getMotor().getFatorDePotencia());
        Ferrari ferrari = new Ferrari();
        ferrari.setCor("vermelha");
        System.out.println(ferrari.getMotor().getFatorDePotencia());
        f.acelerar();
        ferrari.acelerar();
        System.out.println(f.getMotor().getFatorDePotencia());
        System.out.println(ferrari.getMotor().getFatorDePotencia());
        System.out.println(f);
        System.out.println(ferrari);
        
        ArrayList<Automovel> auto = new ArrayList<>();
        auto.add(f);
        auto.add(ferrari);
        
        for (Automovel automovel : auto) {
            System.out.println(automovel.getCor());
        }
        
        
        
    }
}
