package poo.heranca;

import abstrato.Esportivo;
import abstrato.Luxo;
import poo.associacao.Automovel;

public class Ferrari extends Automovel 
        implements Esportivo, Luxo {

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

    @Override
    public String ligarTurbo() {
        return "turbo ligado";
    }

    @Override
    public String desligarTurbo() {
        return "turbo desligado";
    }

    @Override
    public String ligarOAr() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String desligarOAr() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
