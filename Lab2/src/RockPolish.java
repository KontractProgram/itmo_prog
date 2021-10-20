import ru.ifmo.se.pokemon.*;

public class RockPolish extends StatusMove {
    public RockPolish(){
        super(Type.ROCK, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
}
