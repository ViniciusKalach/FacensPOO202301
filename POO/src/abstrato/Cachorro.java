package abstrato;

/**
 *
 * @author edson
 */
public class Cachorro extends Mamifero{
    public String latir(){
        return "au au";
    }

    @Override
    public String mover() {
        return "quatro patas";
    }

    
}
