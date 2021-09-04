public class Main {
    public static void main(String[] args) {
        Scooperfield scooperfield = new Scooperfield("Mr Scooperfield", 10, Locations.OUTSIDE);
        Krabs krabs = new Krabs("Mr Krabs", 10, Locations.OUTSIDE);
        Krabs.Narration story = new Krabs.Narration("Story", 0, Locations.OUTSIDE);


        story.narration(Experience.EXPERIENCE);
        scooperfield.returned(Locations.ROOM);
        krabs.returned(Locations.ROOM);
        scooperfield.inspect(Locations.ROOM);
        scooperfield.smile(Expressions.SMILE);
        scooperfield.grimace_of_disgust(Expressions.SMILE);
        scooperfield.setLocation(Locations.BATHROOM);


        Scooperfield hat = new Scooperfield("hat", 0, Locations.ROOM){
            public void undress(){
                System.out.println("He undressed his hat");
            }
        };
        hat.undress();
        scooperfield.takeout(Items.CYLINDER);
        scooperfield.takeout(Items.TOOTHBRUSH);
        scooperfield.takeout(Items.TOOTH_POWDER);
        scooperfield.takeout(Items.TOWEL);
        scooperfield.takeout(Items.HANDKERCHIEF);
        scooperfield.takeout(Items.SOCKS);
        scooperfield.takeout(Items.NAILS);
        scooperfield.takeout(Items.COPPER_WIRE);
        }

    }
