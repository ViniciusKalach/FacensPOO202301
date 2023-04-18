package poo.associacao;

public abstract class Automovel {

    private String modelo;
    protected String cor;
    public int ano;
    private Motor motor;
    private Pessoa dono;

    public Automovel(String cor, int ano) {
        //this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = new Motor(this);
    }

    /*
    public Automovel() {
        this.motor = new Motor(this);
    }
    */

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    
    public void acelerar() {
        this.motor.setFatorDePotencia(
                this.motor.getFatorDePotencia() + 1
        );
    }

    public void frear() {
        if (this.motor.getFatorDePotencia() > 0) {
            this.motor.setFatorDePotencia(
                    this.motor.getFatorDePotencia() - 1
            );
        }

    }

    @Override
    public String toString() {
        return "A cor é "+getCor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
/*
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
*/
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
