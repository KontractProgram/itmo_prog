import ru.ifmo.se.pokemon.*;

public class WaterGun extends SpecialMove {
    public WaterGun(){
        super(Type.WATER, 40, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
        //aaa
    }
}
