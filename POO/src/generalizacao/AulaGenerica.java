package generalizacao;

import java.util.ArrayList;
import poo.Pessoa;

/**
 *
 * @author edson
 */
public class AulaGenerica {
    public static void main(String[] args) {
        int x = 1;
        double y = 2.3;
        String nome = "Edson";
        Pessoa p1 = new Pessoa();
        
        //exemplo de object
        QualquerCoisa q1 = new QualquerCoisa();
        QualquerCoisa q2 = new QualquerCoisa();
        QualquerCoisa q3 = new QualquerCoisa();
        QualquerCoisa q4 = new QualquerCoisa();
        q1.setCoisa(x);
        q2.setCoisa(y);
        q3.setCoisa(nome);
        q3.setCoisa(p1);
        System.out.println(q1.getCoisa());
        System.out.println(q2.getCoisa());
        ArrayList<Object> listaGeral = new ArrayList<>();
        listaGeral.add(x);
        listaGeral.add(y);
        listaGeral.add(nome);
        listaGeral.add(p1);
        System.out.println((int)q1.getCoisa() + (double)q2.getCoisa());
        //exemplo de Generics
        Generica<Integer> gen = new Generica<>();
        gen.setObjeto(x);
        System.out.println("Teste generic: "+
                gen.getObjeto());
        
    }
}
