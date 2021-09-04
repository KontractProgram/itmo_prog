import java.util.Objects;

public class Scooperfield extends Human implements Imotions,Iinspect,Ismile,IgrimaceOfDisgust{
    private Locations location;

    Scooperfield(String name, double HP, Locations l) {
        super(name, HP);
        this.location = l;
    }


    @Override
    public boolean returned(Locations where) {
        if (where.equals(Locations.ROOM)) {
            System.out.println(this.getName() + " " + "has returned to the " + " " + where);
            this.setHP(1.0);
            System.out.println("Now" + " " + this.getName() + " gets maximum HP: " + this.getHP());
            return true;
        } else {
            System.out.println(this.getName() + " is still on his way");
            return false;
        }
    }

    @Override
    public boolean inspect(Locations where) {
        if (where.equals(Locations.ROOM)) {
            System.out.println(this.getName() + " " + "looked around the room" + where);
            return true;
        } else {
            System.out.println(this.getName() + " has not entered the room yet");
            return false;
        }
    }
    @Override
    public boolean smile(Expressions how){
        if (this.inspect(Locations.ROOM)){
            System.out.println(this.getName() + " smiled");
            return true;
        }
        else {
            System.out.println(this.getName() + " felt disgusted");
            return false;
        }
    }
    @Override
    public boolean grimace_of_disgust(Expressions how){
        if (how.equals(Expressions.SMILE)){
            System.out.println("Though it looks much like a grimace of disgust");
            return true;
        }
        else {
            System.out.println(this.getName() + " felt disgusted");
            return false;
        }
    }

    public void setLocation (Locations L){
        this.location = L;
        System.out.println(this.getName() + " went to the " + L);
    }


    public void remove(Items what){
        System.out.println(this.getName() + " " + "removed " + what);
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (!(o instanceof Scooperfield)) return false;
        Scooperfield scooperfield = (Scooperfield) o;
        return Objects.equals(this.getName(),scooperfield.getName()) &&
                Objects.equals(this.getHP(),scooperfield.getHP());
    }

    @Override
    public int hashCode() {

        return Objects.hash(this.getName(),this.getHP());
    }
}