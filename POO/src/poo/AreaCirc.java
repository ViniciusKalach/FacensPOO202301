package poo;

public class AreaCirc {
    static final double pi = 3.1415;
    double raio;
    public static int quantidade = 0;

    public AreaCirc() {
        //pi = 3.14;
        quantidade ++;
    }
    
    public AreaCirc(double raioEntrada) {
        //pi = 3.14;
        raio = raioEntrada;
        quantidade ++;
    }
    public static double calcular(float raio){
        return pi * Math.pow(raio, 2);
    }
    public double calcular(){
        //return pi * raio * raio;
        return pi * Math.pow(raio, 2);
    }
    public double calcular(double raio){
        return pi * raio * raio;
    }

    public double getPi() {
        return pi;
    }
    /*
    public void setPi(float pi){
        this.pi = pi;
    }
    
    public void setPi(double pi) {
        this.pi = pi;
    }
    */
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
