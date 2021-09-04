import ru.ifmo.se.pokemon.*;

public class Tyrogue extends Pokemon {
    public Tyrogue(String name, int level){
        super(name, level);
        setStats(35, 35, 35, 35, 35, 35);
        setType(Type.FIGHTING);
        setMove(new Swagger(), new Rock_Slide(), new Rest());
    }
}

