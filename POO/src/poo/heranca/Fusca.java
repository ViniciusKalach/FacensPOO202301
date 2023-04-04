package poo.heranca;

import poo.associacao.Automovel;


public class Fusca extends Automovel{

    public Fusca() {
        this("amarelo");
    }
    
    Fusca(String cor){
        super(cor, 0);
    }

    
}
