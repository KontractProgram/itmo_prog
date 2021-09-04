public class Krabs extends Human implements Imotions{
    private Locations location;

    Krabs(String name, int HP, Locations l) {
        super(name, HP);
        this.location = l;
    }

    @Override
    public void returned(Locations where) {
        if (where.equals(Locations.ROOM)) {
            System.out.println(this.getName() + " " + "has returned to the " + " " + where);
            this.setHP(10);
            System.out.println("Now" + " " + this.getName() + " gets maximum HP: " + this.getHP());
        } else {
            System.out.println(this.getName() + " is still on his way");
        }
    }

    static class Narration extends Krabs{
        Narration(String name, int HP, Locations l) {
            super(name,  HP, l);
        }

        public void narration(Experience about){
           try{
               System.out.println("Here is " + this.getName() + " of " + Class.forName("Scooperfield"));
           }
           catch (ClassNotFoundException exep) {
               exep.printStackTrace();
               System.exit(0);
           }
        }
        /**public void narrator(){
            if(!this.getName().equals("Krabs")){
                try {
                    throw new Correct_Name_Exception();
                } catch (Correct_Name_Exception e) {
                    e.printStackTrace();
                }
            }
    }**/

    }
}