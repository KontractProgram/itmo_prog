import ru.ifmo.se.pokemon.*;
public class Play_Nice extends StatusMove {
    protected Play_Nice() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "Decreases the target's attack by one level";
    }
}
