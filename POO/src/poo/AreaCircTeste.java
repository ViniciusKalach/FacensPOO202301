package poo;

import java.util.Scanner;


public class AreaCircTeste {
    //int teste = 0;
    public static void main(String[] args) {
        //teste = 1;
        
        AreaCirc a1 = new AreaCirc(10);
        //System.out.println(a1.getPi());
        //a1.setPi(5);
        System.out.println(a1.calcular());
        //a1.setPi(10);
        //AreaCirc.pi = 3.14;
        System.out.println(a1.calcular());
        AreaCirc a2 = new AreaCirc();
        System.out.println(a2.calcular(10));
        
        System.out.println(AreaCirc.calcular(40f));
        System.out.println("Quantidade: "+ AreaCirc.quantidade);
        
        
    }
}
