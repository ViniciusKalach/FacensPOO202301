package poo.heranca;

import poo.associacao.Automovel;

public class Ferrari extends Automovel{

    public Ferrari() {
        super(null, 0);
    }

    
    @Override
    public void acelerar() {
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
    }

    @Override
    public String toString() {
        return "Minha ferrari é "+ getCor();
    }
    
    
    
}
