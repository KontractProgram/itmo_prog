import ru.ifmo.se.pokemon.*;
public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect( new Effect().condition(Status.SLEEP).turns(2));
        p.setMod(Stat.HP, (int) p.getStat(Stat.HP));
    }

    @Override
    protected  String describe(){
        return "User sleeps for 2 turns and is fully healed :)";
    }
}
