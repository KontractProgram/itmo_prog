import java.util.Objects;

public class Krabs extends Human implements Imotions{
    private Locations location;
    Krabs(String name, double HP, Locations l) {
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

    public void narration(Experience about){

        System.out.println("Here is what " + this.getName() + " said " + about);
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (!(o instanceof Krabs)) return false;
        Krabs krabs = (Krabs) o;
        return Objects.equals(this.getName(),krabs.getName()) &&
                Objects.equals(this.getHP(),krabs.getHP());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(),this.getHP());
    }
}

