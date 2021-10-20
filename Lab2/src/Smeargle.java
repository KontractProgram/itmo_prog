import ru.ifmo.se.pokemon.*;

public class Smeargle extends Pokemon{
    public Smeargle(String name, int level){
        super(name, level);
        setStats(55, 20, 35, 20, 45, 75);
        setType(Type.NORMAL);
        setMove(new Bite(), new WaterGun(), new WaterPulse()
                //new RockSlide()
                );
    }
}
