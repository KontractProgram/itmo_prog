import ru.ifmo.se.pokemon.*;
public class Sing extends StatusMove{
    public Sing(){
        super(Type.NORMAL, 0, 55);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect( new Effect().condition(Status.SLEEP).turns(3));
    }
    @Override
    protected String describe() {
        return "Opponent put to sleep";
    }
}
