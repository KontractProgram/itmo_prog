import ru.ifmo.se.pokemon.*;

public class Shadow_Claw extends PhysicalMove {
    public Shadow_Claw() {
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int) Math.round(damage)*3);
    }
}