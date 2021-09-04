public abstract class Human {

    private final String name;
    private int HP;
    Human(String name, int HP) {
      this.name = name;
      this.HP = HP;
    }
    public String getName(){ return this.name;}
    public double getHP(){ return this.HP;}
    public void setHP(int newHP){
        this.HP = newHP;
    }
}
