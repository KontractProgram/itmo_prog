public class Main {
    public static void main(String[] args) {
        Scooperfield scooperfield = new Scooperfield("Mr Scooperfield", 0.7, Locations.OUTSIDE);
        Krabs krabs = new Krabs("Mr Krabs", 0.5, Locations.OUTSIDE);
        krabs.narration(Experience.EXPERIENCE);
        scooperfield.returned(Locations.ROOM);
        krabs.returned(Locations.ROOM);
        scooperfield.inspect(Locations.ROOM);
        scooperfield.smile(Expressions.SMILE);
        scooperfield.grimace_of_disgust(Expressions.SMILE);
        scooperfield.setLocation(Locations.BATHROOM);
        scooperfield.remove(Items.CYLINDER);
        scooperfield.remove(Items.TOOTHBRUSH);
        scooperfield.remove(Items.TOOTH_POWDER);
        scooperfield.remove(Items.TOWEL);
        scooperfield.remove(Items.HANDKERCHIEF);
        scooperfield.remove(Items.SOCKS);
        scooperfield.remove(Items.NAILS);
        scooperfield.remove(Items.COPPER_WIRE);
        }
    }
