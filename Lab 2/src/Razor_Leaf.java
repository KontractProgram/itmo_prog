import ru.ifmo.se.pokemon.*;
public class Razor_Leaf extends PhysicalMove{
    public Razor_Leaf(){
        super(Type.GRASS, 55,95);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP,(int) Math.round(damage)*3);
    }
}
