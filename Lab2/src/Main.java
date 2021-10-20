import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();
        Smeargle smeargle = new Smeargle("James", 1);
        Drifloon drifloon = new Drifloon("Tosco", 1);
        Drifblim drifblim = new Drifblim("Alex", 1);
        battle.addAlly(smeargle);
        battle.addFoe(drifloon);
        battle.addAlly(drifblim);
        battle.go();
    }
}
