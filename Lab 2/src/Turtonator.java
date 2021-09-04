import ru.ifmo.se.pokemon.*;

public class Turtonator extends Pokemon {
    public Turtonator(String name, int level){
        super(name, level);
        setStats(60, 78, 135, 91, 85, 35);
        setType(Type.FIRE, Type.DRAGON);
        setMove(new Swagger(), new Sing(), new Play_Rough(), new Shadow_Claw());
    }
}
