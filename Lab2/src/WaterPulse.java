import ru.ifmo.se.pokemon.*;

public class WaterPulse extends SpecialMove {
    public WaterPulse(){
        super(Type.WATER, 60, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
        Effect.confuse(p);
    }
}
