import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle World_Wide_3 = new Battle();
        World_Wide_3.addAlly(new Turtonator ("Trump",1));
        World_Wide_3.addAlly(new Tyrogue  ("Carson",1));
        World_Wide_3.addAlly(new Hitmontop ("Pence",1));
        World_Wide_3.addFoe(new Bounsweet   ("Biden",1));
        World_Wide_3.addFoe(new Steenee   ("Hillary",1));
        World_Wide_3.addFoe(new Tsareena   ("Harris",1));
        World_Wide_3.go();
    }
}
