import javax.naming.CannotProceedException;

public class Scooperfield extends Human implements Imotions,Iinspect,Ismile,IgrimaceOfDisgust,Itakeout{
    private Locations location;
    public int count;


    Scooperfield(String name, int HP, Locations l) {
        super(name, HP);
        this.location = l;
    }


    @Override
    public void returned(Locations where) {
            if (where.equals(Locations.ROOM)) {
                System.out.println(this.getName() + " " + "has returned to the " + " " + where);
                this.setHP(10);
                System.out.println("Now" + " " + this.getName() + " gets maximum HP: " + this.getHP());

            }

        else {
            System.out.println(this.getName() + " died in the mission. The story is a lie");
            System.exit(0);
        }
        try {if (where.equals(Locations.OUTSIDE)){ }}
        catch (Exception exe) {
            System.out.println(this.getName() + " died in the mission. The story is a lie");
            System.exit(0);
        }
    }


    @Override
    public boolean inspect(Locations where) {
        if (where.equals(Locations.ROOM)) {
            System.out.println(this.getName() + " " + "looked around the" + where);
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



    public void takeout(Items what){
        System.out.println(this.getName() + "removed" + what);

        this.setHP((int) this.getHP()-1 );

        try{if (this.getHP() == 1) {
            throw new CannotRemoveException();
            }
        }
        catch (CannotRemoveException ex){
            System.out.println(ex.message());
            System.exit(0);
        }
    }

    public void undress() {}
}