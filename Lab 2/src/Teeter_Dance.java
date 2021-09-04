import ru.ifmo.se.pokemon.*;
class Teeter_Dance extends StatusMove{
    protected Teeter_Dance(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }
}