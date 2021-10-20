import ru.ifmo.se.pokemon.*;


public class Bite extends PhysicalMove {
    public Bite(){
        super(Type.DARK, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect.flinch(pokemon);

    }
}
