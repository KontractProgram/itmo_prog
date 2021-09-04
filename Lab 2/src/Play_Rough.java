import ru.ifmo.se.pokemon.*;

public class Play_Rough extends PhysicalMove{
    protected Play_Rough(){
        super(Type.FAIRY, 90, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1) Effect.flinch(p);
        p.setMod(Stat.ATTACK, -1);
    }
}
