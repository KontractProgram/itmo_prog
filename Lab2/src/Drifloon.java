import ru.ifmo.se.pokemon.*;


public class Drifloon extends Pokemon {
    public Drifloon(String name, int level){
        super(name, level);
        setStats(90, 50, 34, 60, 44, 70);
        setType(Type.GHOST,Type.FLYING);
        setMove(new Swagger()
                //new SwordsDance(), new FocusEnergy()
                //
                );
    }
}
