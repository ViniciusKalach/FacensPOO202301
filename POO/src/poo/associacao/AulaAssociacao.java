package poo.associacao;


public class AulaAssociacao {
    public static void main(String[] args) {
        //Motor m1 = new Motor();
        Automovel auto1 = new Automovel("fusca", "azul marinho"
                , 1963);
        Automovel auto2 = new Automovel("Onix", "branco", 
                2022);
        System.out.println(auto1.getMotor().getFatorDePotencia());
        System.out.println(auto1.getMotor().getAutomovel().getMotor().
                getFatorDePotencia());
        auto1.acelerar();
        auto1.acelerar();
        auto1.acelerar();
        auto2.frear();
        System.out.println(auto1.getMotor().getFatorDePotencia());
        System.out.println(auto2.getMotor().getFatorDePotencia());
        Pessoa p1 = new Pessoa("Edson");
        p1.setAutomovel(auto1);
        p1.setAutomovel(auto2);
        System.out.println(p1.getAutomoveis().
                get(0).getModelo());
        p1.getAutomoveis().get(1).getMotor().
                getAutomovel().getDono();
    }
}
