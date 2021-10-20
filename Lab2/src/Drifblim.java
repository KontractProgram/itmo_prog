import ru.ifmo.se.pokemon.*;

public class Drifblim extends Drifloon{
    public Drifblim(String name, int level){
        super(name, level);
        setStats(150, 80, 44, 90, 54, 80);
        setType(Type.GHOST, Type.FLYING);
        //setMove(new Venshock());
    }
}
